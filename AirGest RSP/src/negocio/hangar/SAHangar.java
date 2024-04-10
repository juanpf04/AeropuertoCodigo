package negocio.hangar;

import java.awt.List;

public interface SAHangar {
	
	public int altaHangar(THangar tHangar);

	public boolean bajaHangar(int id);

	public THangar consultarHangarPorId(int id);

	public List consultarTodosHangares();

	public boolean modificarHangar(THangar tHangar);
}