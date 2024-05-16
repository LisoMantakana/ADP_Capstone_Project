package za.ac.cput.adp_capstone_project.service;

public interface IService<T, ID>{
    T create(T t);
    T read(ID id);
    T update(T t);

}
