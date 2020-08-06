package libdwarf;
import com.ochafik.lang.jnaerator.runtime.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class Dwarf_Locdesc extends Structure<Dwarf_Locdesc, Dwarf_Locdesc.ByValue, Dwarf_Locdesc.ByReference > {
	/**
	 * Beginning of active range. This is actually an offset<br>
	 * of an applicable base address, not a pc value.<br>
	 * C type : Dwarf_Addr
	 */
	public long ld_lopc;
	/**
	 * End of active range. This is actually an offset<br>
	 * of an applicable base address, not a pc value.<br>
	 * C type : Dwarf_Addr
	 */
	public long ld_hipc;
	/**
	 * count of location records<br>
	 * C type : Dwarf_Half
	 */
	public short ld_cents;
	/**
	 * pointer to list of same<br>
	 * C type : Dwarf_Loc*
	 */
	public libdwarf.Dwarf_Loc.ByReference ld_s;
	/**
	 * non-0 if loclist, 1 if non-split (dwarf 2,3,4)<br>
	 * C type : Dwarf_Small
	 */
	public byte ld_from_loclist;
	/**
	 * Section (not CU) offset<br>
	 * where loc-expr begins<br>
	 * C type : Dwarf_Unsigned
	 */
	public long ld_section_offset;
	public Dwarf_Locdesc() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ld_lopc", "ld_hipc", "ld_cents", "ld_s", "ld_from_loclist", "ld_section_offset");
	}
	/**
	 * @param ld_lopc Beginning of active range. This is actually an offset<br>
	 * of an applicable base address, not a pc value.<br>
	 * C type : Dwarf_Addr<br>
	 * @param ld_hipc End of active range. This is actually an offset<br>
	 * of an applicable base address, not a pc value.<br>
	 * C type : Dwarf_Addr<br>
	 * @param ld_cents count of location records<br>
	 * C type : Dwarf_Half<br>
	 * @param ld_s pointer to list of same<br>
	 * C type : Dwarf_Loc*<br>
	 * @param ld_from_loclist non-0 if loclist, 1 if non-split (dwarf 2,3,4)<br>
	 * C type : Dwarf_Small<br>
	 * @param ld_section_offset Section (not CU) offset<br>
	 * where loc-expr begins<br>
	 * C type : Dwarf_Unsigned
	 */
	public Dwarf_Locdesc(long ld_lopc, long ld_hipc, short ld_cents, libdwarf.Dwarf_Loc.ByReference ld_s, byte ld_from_loclist, long ld_section_offset) {
		super();
		this.ld_lopc = ld_lopc;
		this.ld_hipc = ld_hipc;
		this.ld_cents = ld_cents;
		this.ld_s = ld_s;
		this.ld_from_loclist = ld_from_loclist;
		this.ld_section_offset = ld_section_offset;
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected Dwarf_Locdesc newInstance() { return new Dwarf_Locdesc(); }
	public static Dwarf_Locdesc[] newArray(int arrayLength) {
		return Structure.newArray(Dwarf_Locdesc.class, arrayLength);
	}
	public static class ByReference extends Dwarf_Locdesc implements Structure.ByReference {
		
	};
	public static class ByValue extends Dwarf_Locdesc implements Structure.ByValue {
		
	};
}
