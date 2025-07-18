package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzw {
    public String a;
    public lio b;
    public tst c;
    public tst d;
    private boolean e;
    private boolean f;
    private boolean g;
    private ImmutableList h;
    private ImmutableList i;
    private ImmutableList j;
    private ImmutableList k;
    private byte l;

    public mzw() {
        throw null;
    }

    public final mzx a() {
        String str;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        ImmutableList immutableList3;
        ImmutableList immutableList4;
        lio lioVar;
        if (this.l == 7 && (str = this.a) != null && (immutableList = this.h) != null && (immutableList2 = this.i) != null && (immutableList3 = this.j) != null && (immutableList4 = this.k) != null && (lioVar = this.b) != null) {
            return new mzx(str, this.e, this.f, this.g, immutableList, immutableList2, immutableList3, immutableList4, lioVar, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" description");
        }
        if ((this.l & 1) == 0) {
            sb.append(" isExpanded");
        }
        if ((this.l & 2) == 0) {
            sb.append(" useReplayTwoLinesDetailsDescription");
        }
        if ((this.l & 4) == 0) {
            sb.append(" forceExpandedForA11y");
        }
        if (this.h == null) {
            sb.append(" actors");
        }
        if (this.i == null) {
            sb.append(" directors");
        }
        if (this.j == null) {
            sb.append(" producers");
        }
        if (this.k == null) {
            sb.append(" writers");
        }
        if (this.b == null) {
            sb.append(" uiElementNode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        this.h = ImmutableList.copyOf((Collection) list);
    }

    public final void c(List list) {
        this.i = ImmutableList.copyOf((Collection) list);
    }

    public final void d(boolean z) {
        this.g = z;
        this.l = (byte) (this.l | 4);
    }

    public final void e(boolean z) {
        this.e = z;
        this.l = (byte) (this.l | 1);
    }

    public final void f(List list) {
        this.j = ImmutableList.copyOf((Collection) list);
    }

    public final void g(boolean z) {
        this.f = z;
        this.l = (byte) (this.l | 2);
    }

    public final void h(List list) {
        this.k = ImmutableList.copyOf((Collection) list);
    }

    public mzw(byte[] bArr) {
        trk trkVar = trk.a;
        this.c = trkVar;
        this.d = trkVar;
    }
}
