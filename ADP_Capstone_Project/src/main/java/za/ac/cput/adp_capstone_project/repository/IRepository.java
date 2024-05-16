package za.ac.cput.adp_capstone_project.repository;

@Deprecated
public interface IRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
}
