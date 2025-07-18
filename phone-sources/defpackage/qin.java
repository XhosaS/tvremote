package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qin {
    public vnz a;
    public int b;
    private String c;
    private vll d;
    private long e;
    private long f;
    private long g;
    private String h;
    private vsl i;
    private long j;
    private vsz k;
    private String l;
    private Set m;
    private vld n;
    private List o;
    private String p;
    private long q;
    private long r;
    private List s;
    private int t;
    private int u;
    private int v;
    private int w;

    public final qis a() {
        List list;
        vld vldVar;
        vnz vnzVar;
        int i = ~this.b;
        if ((i & 1) != 0) {
            throw new IllegalStateException("Missing required properties: id");
        }
        String str = this.c;
        int i2 = this.w;
        vll vllVar = this.d;
        int i3 = this.t;
        int i4 = this.u;
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        String str2 = this.h;
        vsl vslVar = this.i;
        int i5 = i2;
        vll vllVar2 = vllVar;
        long j4 = this.j;
        int i6 = this.v;
        vsz vszVar = this.k;
        int i7 = i6;
        String str3 = this.l;
        Set set = this.m;
        vld vldVar2 = this.n;
        List list2 = this.o;
        String str4 = this.p;
        long j5 = this.q;
        long j6 = this.r;
        vnz vnzVar2 = this.a;
        List list3 = this.s;
        if ((i & 2) != 0) {
            i5 = vmb.a;
        }
        if ((i & 4) != 0) {
            vllVar2 = vll.DELETION_STATUS_UNKNOWN;
        }
        if ((i & 8) != 0) {
            i3 = 1;
        }
        if ((i & 16) != 0) {
            i4 = 1;
        }
        if ((i & 32) != 0) {
            j = 0;
        }
        if ((i & 64) != 0) {
            j2 = 0;
        }
        if ((i & 128) != 0) {
            j3 = 0;
        }
        if ((i & 256) != 0) {
            str2 = null;
        }
        if ((i & 512) != 0) {
            vslVar = null;
        }
        if ((i & 1024) != 0) {
            j4 = 0;
        }
        if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
            i7 = 1;
        }
        vsz vszVar2 = (i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? vsz.b : vszVar;
        if ((i & 8192) != 0) {
            str3 = null;
        }
        Set set2 = (i & 16384) != 0 ? yhd.a : set;
        vld vldVar3 = (i & 32768) != 0 ? vld.a : vldVar2;
        List list4 = (i & 65536) != 0 ? yhb.a : list2;
        if ((i & 131072) != 0) {
            str4 = "chime_default_group";
        }
        if ((i & 262144) != 0) {
            j5 = 0;
        }
        if ((i & 524288) != 0) {
            j6 = 0;
        }
        if ((i & 1048576) != 0) {
            vnzVar2 = null;
        }
        if ((i & 2097152) != 0) {
            list = yhb.a;
            vnzVar = vnzVar2;
            vldVar = vldVar3;
        } else {
            list = list3;
            vldVar = vldVar3;
            vnzVar = vnzVar2;
        }
        long j7 = j;
        int i8 = i3;
        return new qis(str, i5, vllVar2, i8, i4, j7, j2, j3, str2, vslVar, j4, i7, vszVar2, str3, set2, vldVar, list4, str4, j5, j6, vnzVar, list);
    }

    public final void b(List list) {
        this.s = list;
        this.b |= 2097152;
    }

    public final void c(vld vldVar) {
        if (vldVar == null) {
            throw new NullPointerException("Null androidSdkMessage");
        }
        this.n = vldVar;
        this.b |= 32768;
    }

    public final void d(long j) {
        this.g = j;
        this.b |= 128;
    }

    public final void e(vll vllVar) {
        if (vllVar == null) {
            throw new NullPointerException("Null deletionStatus");
        }
        this.d = vllVar;
        this.b |= 4;
    }

    public final void f(long j) {
        this.r = j;
        this.b |= 524288;
    }

    public final void g(long j) {
        this.q = j;
        this.b |= 262144;
    }

    public final void h(Set set) {
        this.m = set;
        this.b |= 16384;
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupId");
        }
        this.p = str;
        this.b |= 131072;
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.c = str;
        this.b |= 1;
    }

    public final void k(long j) {
        this.j = j;
        this.b |= 1024;
    }

    public final void l(long j) {
        this.f = j;
        this.b |= 64;
    }

    public final void m(long j) {
        this.e = j;
        this.b |= 32;
    }

    public final void n(List list) {
        this.o = list;
        this.b |= 65536;
    }

    public final void o(vsz vszVar) {
        this.k = vszVar;
        this.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    }

    public final void p(vsl vslVar) {
        this.i = vslVar;
        this.b |= 512;
    }

    public final void q(String str) {
        this.h = str;
        this.b |= 256;
    }

    public final void r(String str) {
        this.l = str;
        this.b |= 8192;
    }

    public final void s(int i) {
        if (i == 0) {
            throw new NullPointerException("Null countBehavior");
        }
        this.t = i;
        this.b |= 8;
    }

    public final void t(int i) {
        if (i == 0) {
            throw new NullPointerException("Null storageMode");
        }
        this.v = i;
        this.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
    }

    public final void u(int i) {
        if (i == 0) {
            throw new NullPointerException("Null systemTrayBehavior");
        }
        this.u = i;
        this.b |= 16;
    }

    public final void v(int i) {
        if (i == 0) {
            throw new NullPointerException("Null readState");
        }
        this.w = i;
        this.b |= 2;
    }
}
