package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmc {
    public int a;
    private boolean b;
    private ieg c;
    private ieg d;
    private ieg e;
    private ieg f;
    private ieg g;
    private boolean h;
    private boolean i;
    private byte j;

    public final mmd a() {
        ieg iegVar;
        ieg iegVar2;
        ieg iegVar3;
        ieg iegVar4;
        ieg iegVar5;
        int i;
        if (this.j == 15 && (iegVar = this.c) != null && (iegVar2 = this.d) != null && (iegVar3 = this.e) != null && (iegVar4 = this.f) != null && (iegVar5 = this.g) != null && (i = this.a) != 0) {
            return new mln(this.b, iegVar, iegVar2, iegVar3, iegVar4, iegVar5, this.h, this.i, i, false);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" isSynopsisExpanded");
        }
        if (this.c == null) {
            sb.append(" selectedSeason");
        }
        if (this.d == null) {
            sb.append(" initialSeasonLocationNumber");
        }
        if (this.e == null) {
            sb.append(" selectedDistributor");
        }
        if (this.f == null) {
            sb.append(" initialDistributorSelectionTypeNumber");
        }
        if (this.g == null) {
            sb.append(" expandedEpisode");
        }
        if ((this.j & 2) == 0) {
            sb.append(" showAllEpisodes");
        }
        if ((this.j & 4) == 0) {
            sb.append(" fromSavedInstanceState");
        }
        if (this.a == 0) {
            sb.append(" displayActionType");
        }
        if ((this.j & 8) == 0) {
            sb.append(" isRedirectedForBirthdayEntry");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null expandedEpisode");
        }
        this.g = iegVar;
    }

    public final void c(boolean z) {
        this.i = z;
        this.j = (byte) (this.j | 4);
    }

    public final void d(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null initialDistributorSelectionTypeNumber");
        }
        this.f = iegVar;
    }

    public final void e(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null initialSeasonLocationNumber");
        }
        this.d = iegVar;
    }

    public final void f(boolean z) {
        this.b = z;
        this.j = (byte) (this.j | 1);
    }

    public final void g(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null selectedDistributor");
        }
        this.e = iegVar;
    }

    public final void h(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null selectedSeason");
        }
        this.c = iegVar;
    }

    public final void i(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 2);
    }

    public final void j() {
        this.j = (byte) (this.j | 8);
    }
}
