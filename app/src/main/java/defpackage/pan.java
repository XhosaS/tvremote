package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class pan {
    public final zpj a;
    public final zoq b;
    public final Set c;
    public boolean d;
    public int e;

    public pan(int i) {
        zpk zpkVar = zpk.a;
        zpj zpjVar = new zpj();
        this.a = zpjVar;
        zot zotVar = zot.a;
        this.b = new zoq();
        this.c = new HashSet();
        this.e = 1;
        this.d = false;
        if ((zpjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpjVar.y();
        }
        zpk zpkVar2 = (zpk) zpjVar.b;
        zpkVar2.b |= 8;
        zpkVar2.d = i;
    }

    public final zpk a() {
        return (zpk) this.a.v();
    }

    public final acjc b() {
        zot zotVar = (zot) this.b.b;
        if ((zotVar.b & 16) == 0) {
            return null;
        }
        acjc acjcVar = zotVar.h;
        return acjcVar == null ? acjc.a : acjcVar;
    }

    public final boolean c(int i) {
        return this.c.contains(Integer.valueOf(i));
    }

    public final void d(acjc acjcVar) {
        if (acjcVar == null) {
            zoq zoqVar = this.b;
            if ((Integer.MIN_VALUE & zoqVar.b.memoizedSerializedSize) == 0) {
                zoqVar.y();
            }
            zot zotVar = (zot) zoqVar.b;
            zot zotVar2 = zot.a;
            zotVar.h = null;
            zotVar.b &= -17;
            return;
        }
        zoq zoqVar2 = this.b;
        if ((Integer.MIN_VALUE & zoqVar2.b.memoizedSerializedSize) == 0) {
            zoqVar2.y();
        }
        zot zotVar3 = (zot) zoqVar2.b;
        zot zotVar4 = zot.a;
        zotVar3.h = acjcVar;
        zotVar3.b |= 16;
    }

    public final void e(int i) {
        this.e = i;
        this.d = true;
    }

    public final void f() {
        this.c.add(4);
    }

    public final String toString() {
        return "Ve[" + super.toString() + ";id=" + ((zpk) this.a.b).d + ";interactions=" + this.c.toString() + "]";
    }
}
