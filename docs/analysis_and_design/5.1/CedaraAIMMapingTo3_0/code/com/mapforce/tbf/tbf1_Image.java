/**
 * tbf/tbf1_Image.java
 *
 * This file was generated by MapForce 2011r2sp1.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */
package com.mapforce.tbf;
import com.altova.mapforce.*;
import com.altova.types.*;
import com.altova.xml.*;
import java.util.*;

public class tbf1_Image extends com.altova.TraceProvider 
{

	
	static class main implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_input;
	
		public main(com.altova.mapforce.IMFNode var1_input)
		{
			this.var1_input = var1_input;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 2;
			Object current;
			main closure;
			IEnumerator var2_filter_attributes;
			IEnumerator var3_filter_attributes;
			IEnumerator var4_filter_attributes;
			public Enumerator(main closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 2:	if (moveNext_2()) return true; break;
					case 3:	if (moveNext_3()) return true; break;
					case 4:	if (moveNext_4()) return true; break;
					case 6:	if (moveNext_6()) return true; break;
					case 7:	if (moveNext_7()) return true; break;
					case 9:	if (moveNext_9()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_2() throws Exception {
				state = 3;				
				var2_filter_attributes = (com.altova.functions.Core.filterAttributes(com.altova.functions.Core.createQName("cagridId", ""), closure.var1_input)).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 3;				
				if (!var2_filter_attributes.moveNext()) {state = 4; return false; }
				current = (com.altova.mapforce.IMFNode)com.altova.functions.Core.first((new seq1_seq_(((com.altova.mapforce.IMFNode)(var2_filter_attributes.current())))));
				pos++;
				return true;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				var3_filter_attributes = (com.altova.functions.Core.filterAttributes(com.altova.functions.Core.createQName("sopClassUID", ""), closure.var1_input)).enumerator();
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 6;				
				if (!var3_filter_attributes.moveNext()) {state = 7; return false; }
				current = (com.altova.mapforce.IMFNode)com.altova.functions.Core.first((new seq2_seq_(((com.altova.mapforce.IMFNode)(var3_filter_attributes.current())))));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 9;				
				var4_filter_attributes = (com.altova.functions.Core.filterAttributes(com.altova.functions.Core.createQName("sopInstanceUID", ""), closure.var1_input)).enumerator();
				return false;
			}
			private boolean moveNext_9() throws Exception {
				state = 9;				
				if (!var4_filter_attributes.moveNext()) {state = 0; return false; }
				current = (com.altova.mapforce.IMFNode)com.altova.functions.Core.first((new seq3_seq_(((com.altova.mapforce.IMFNode)(var4_filter_attributes.current())))));
				pos++;
				return true;
			}

			
			public void close()
			{
				try
				{
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq1_seq_ implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_current;
	
		public seq1_seq_(com.altova.mapforce.IMFNode var1_current)
		{
			this.var1_current = var1_current;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq1_seq_ closure;
			public Enumerator(seq1_seq_ closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 0;				
				current = com.altova.functions.Core.createAttribute(com.altova.functions.Core.createQName("cagridId", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString(closure.var1_current)));
				pos++;
				return true;
			}

			
			public void close()
			{
				try
				{
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq2_seq_ implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_current;
	
		public seq2_seq_(com.altova.mapforce.IMFNode var1_current)
		{
			this.var1_current = var1_current;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq2_seq_ closure;
			public Enumerator(seq2_seq_ closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 0;				
				current = com.altova.functions.Core.createAttribute(com.altova.functions.Core.createQName("sopClassUID", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString(closure.var1_current)));
				pos++;
				return true;
			}

			
			public void close()
			{
				try
				{
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq3_seq_ implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_current;
	
		public seq3_seq_(com.altova.mapforce.IMFNode var1_current)
		{
			this.var1_current = var1_current;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq3_seq_ closure;
			public Enumerator(seq3_seq_ closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 0;				
				current = com.altova.functions.Core.createAttribute(com.altova.functions.Core.createQName("sopInstanceUID", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString(closure.var1_current)));
				pos++;
				return true;
			}

			
			public void close()
			{
				try
				{
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}





	public static IEnumerable create(com.altova.mapforce.IMFNode var1_input)
	{
		return new main(
			var1_input
			);

	}
	

}
