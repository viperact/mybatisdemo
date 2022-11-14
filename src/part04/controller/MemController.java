package part04.controller;

import java.util.List;

import part04.dao.MemDAO;
import part04.dto.MemDTO;

public class MemController {
	private MemDAO dao;
	
	public MemController() {
		dao = new MemDAO();
	}
	
	public List<MemDTO> selectProcess(){
		return dao.allMethod();
	}
	
	public int multiInsertProcess(List<MemDTO> list) {
		for(MemDTO dto : list)
			dto.setNum(dao.keyMethod());
		
		return dao.multiInsertProcess(list);
	}
	
	public int multiDeleteProcess(List<Integer> list) {
		return dao.multiDeleteMethod(list);
	}
	
	public List<MemDTO> searchProcess(MemDTO dto){
		return dao.searchMethod(dto);
	}
	
	public int multiUpadteProcess(MemDTO dto) {
		return dao.multiUpdateMethod(dto);
	}
	
	public int insertDataProcess(MemDTO dto) {
		return dao.insertDataMethod(dto);
	}
}//end class
