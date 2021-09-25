package ru.diasoft.nblond.repo.dao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.context.annotation.Import;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;

import static org.assertj.core.api.Assertions.*;

/*
@DisplayName("Dao для работы с книгами должно")
@JdbcTest
@Import(BookDaoJdbc.class)
public class BookDaoJdbcTest {

    private static final int EXPECTED_BOOKS_COUNT = 1;
    private static final int EXISTING_BOOKS_ID = 0;
    private static final String EXISTING_BOOKS_NAME = "test_book";

    @Autowired
    private BookDaoJdbc bookDao;

    @BeforeTransaction
    void beforeTransaction(){
        System.out.println("beforeTransaction");
    }

    @AfterTransaction
    void afterTransaction(){
        System.out.println("afterTransaction");
    }

    @DisplayName("возвращать ожидаемое количество книг в БД")
    @Test
    void shouldReturnExpectedCount() {
        var actualPersonsCount = bookDao.count();
        assertThat(actualPersonsCount).isEqualTo(EXPECTED_BOOKS_COUNT);
    }

    @Rollback
    @DisplayName("добавлять книги в БД")
    @Test
    void shouldInsert() {
        var expected = new Book(1, "test");
        bookDao.insert(expected);
        var actual = bookDao.getById(expected.getId());
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @DisplayName("возвращать ожидаемую книгу по её id")
    @Test
    void shouldReturnExpectedById() {
        var expected = new Book(EXISTING_BOOKS_ID, EXISTING_BOOKS_NAME);
        var actual = bookDao.getById(expected.getId());
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @Rollback
    @DisplayName("удалять заданную книгу по её id")
    @Test
    void shouldCorrectDeleteById() {
        assertThatCode(() -> bookDao.getById(EXISTING_BOOKS_ID))
                .doesNotThrowAnyException();

        bookDao.deleteById(EXISTING_BOOKS_ID);

        assertThatThrownBy(() -> bookDao.getById(EXISTING_BOOKS_ID))
                .isInstanceOf(EmptyResultDataAccessException.class);
    }

    @DisplayName("возвращать ожидаемый список книг")
    @Test
    void shouldReturnExpectedList() {
        var expected = new Book(EXISTING_BOOKS_ID, EXISTING_BOOKS_NAME);
        var actualList = bookDao.getAll();
        assertThat(actualList)
                .usingFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(expected);
    }

}*/