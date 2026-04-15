package test.com.laptanovich.arraytask.repository;

import com.laptanovich.arraytask.repository.ArrayRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ArrayRepositoryTest {
    private ArrayRepository repository = ArrayRepository.getInstance();

    @Test
    void repositoryReturnsSameObject() {
        ArrayRepository repo1 = ArrayRepository.getInstance();
        ArrayRepository repo2 = ArrayRepository.getInstance();
        assertSame(repo1, repo2);
    }

    @Test
    void addPutsArrayInRepository() {
        ArrayRepository repository = ArrayRepository.getInstance();
        CustomArray array = new CustomArray(new int[]{1, 2, 3}, 11);
        repository.add(array);

        List<CustomArray> result = repository.query(item -> item.getId() == 11);
        assertEquals(1, result.size());
        assertEquals(11, result.get(0).getId());
    }

    @Test
    void removeDeletesArrayFromRepository() {
        ArrayRepository repository = ArrayRepository.getInstance();
        CustomArray array = new CustomArray(new int[]{4, 5, 6}, 12);
        repository.add(array);
        repository.remove(array);

        List<CustomArray> result = repository.query(item -> item.getId() == 12);
        assertTrue(result.isEmpty());
    }

    @Test
    void sortOrdersById() {
        ArrayRepository repository = ArrayRepository.getInstance();
        CustomArray first = new CustomArray(new int[]{3, 1}, 20);
        CustomArray second = new CustomArray(new int[]{1, 9}, 10);
        repository.add(first);
        repository.add(second);

        List<CustomArray> result = repository.sort(Comparator.comparingInt(CustomArray::getId));
        assertEquals(10, result.get(0).getId());
        assertEquals(20, result.get(1).getId());
    }