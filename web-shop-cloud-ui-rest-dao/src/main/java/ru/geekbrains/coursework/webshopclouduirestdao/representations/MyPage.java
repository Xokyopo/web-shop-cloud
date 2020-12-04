package ru.geekbrains.coursework.webshopclouduirestdao.representations;

import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Objects;

public class MyPage<E> {
    private List<E> content;
    private Integer totalPages;
    private Integer number;
    private Integer previousPage;
    private Integer nextPage;

    public MyPage() {
    }

    public MyPage(Page<E> page) {
        if (page.hasContent()) {
            content = page.getContent();
            totalPages = page.getTotalPages();
            number = page.getNumber();
            previousPage = (page.hasPrevious()) ? page.previousPageable().getPageNumber() : null;
            nextPage = (page.hasNext()) ? page.nextPageable().getPageNumber() : null;
        }
    }

    public List<E> getContent() {
        return content;
    }

    public void setContent(List<E> content) {
        this.content = content;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPreviousPage() {
        return previousPage;
    }

    public void setPreviousPage(Integer previousPage) {
        this.previousPage = previousPage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public boolean hasContent() {
        return Objects.nonNull(content) && !content.isEmpty();
    }

    public boolean hasPrevious() {
        return Objects.nonNull(previousPage);
    }

    public boolean hasNext() {
        return Objects.nonNull(nextPage);
    }
}
