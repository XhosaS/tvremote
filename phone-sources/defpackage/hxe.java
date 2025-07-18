package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxe {
    public static final hxe a = new hxe(hxd.None, 0);
    public static final hxe b = new hxe(hxd.XMidYMid, 1);
    public final hxd c;
    public final int d;

    public hxe(hxd hxdVar, int i) {
        this.c = hxdVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hxe hxeVar = (hxe) obj;
        return this.c == hxeVar.c && this.d == hxeVar.d;
    }
}
