package org.example;

class LoggingDecorator<T> implements Repository<T> {
    private Repository<T> repository;

    public LoggingDecorator(Repository<T> repository) {
        this.repository = repository;
    }

    @Override
    public void add(T item) {
        System.out.println("Logging: Adding operation");
        repository.add(item);
    }

    @Override
    public T get(int id) {
        System.out.println("Logging: Reading operation");
        return repository.get(id);
    }

    @Override
    public void update(T item) {
        System.out.println("Logging: Updating operation");
        repository.update(item);
    }

    @Override
    public void delete(int id) {
        System.out.println("Logging: Deleting operation");
        repository.delete(id);
    }
}