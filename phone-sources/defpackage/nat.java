package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nat {
    public Object a;
    public Object b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private byte h;
    private Object i;

    public final nau a() {
        Object obj;
        Object obj2;
        Object obj3;
        if (this.h == 31 && (obj = this.a) != null && (obj2 = this.i) != null && (obj3 = this.b) != null) {
            return new nau((String) obj, (kxe) obj2, this.c, (ksx) obj3, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" title");
        }
        if (this.i == null) {
            sb.append(" userSentiment");
        }
        if ((this.h & 1) == 0) {
            sb.append(" isWatchlisted");
        }
        if (this.b == null) {
            sb.append(" assetDetailsRestrictions");
        }
        if ((this.h & 2) == 0) {
            sb.append(" isDownloadable");
        }
        if ((this.h & 4) == 0) {
            sb.append(" useReplayTextWithUserFeedback");
        }
        if ((this.h & 8) == 0) {
            sb.append(" isGtvApplication");
        }
        if ((this.h & 16) == 0) {
            sb.append(" isPelogEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 8);
    }

    public final void c(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 16);
    }

    public final void d(boolean z) {
        this.e = z;
        this.h = (byte) (this.h | 4);
    }

    public final void e(kxe kxeVar) {
        if (kxeVar == null) {
            throw new NullPointerException("Null userSentiment");
        }
        this.i = kxeVar;
    }

    public final void f(boolean z) {
        this.d = z;
        this.h = (byte) (this.h | 2);
    }

    public final void g(boolean z) {
        this.c = z;
        this.h = (byte) (this.h | 1);
    }

    public final mxo h() {
        Object obj;
        Object obj2;
        Object obj3;
        if (this.h == 31 && (obj = this.a) != null && (obj2 = this.i) != null && (obj3 = this.b) != null) {
            return new mxb((ImmutableList) obj, (mxe) obj2, this.c, (ieg) obj3, this.d, this.f, this.g, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" unselectedDistributors");
        }
        if (this.i == null) {
            sb.append(" selectedDistributor");
        }
        if ((this.h & 1) == 0) {
            sb.append(" shouldShowTooltip");
        }
        if (this.b == null) {
            sb.append(" oowMessage");
        }
        if ((this.h & 2) == 0) {
            sb.append(" isAvod");
        }
        if ((this.h & 4) == 0) {
            sb.append(" isFreeTabEnabled");
        }
        if ((this.h & 8) == 0) {
            sb.append(" isGtvEnabled");
        }
        if ((this.h & 16) == 0) {
            sb.append(" subsDiscoveryEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void i(boolean z) {
        this.d = z;
        this.h = (byte) (this.h | 2);
    }

    public final void j(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 4);
    }

    public final void k(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 8);
    }

    public final void l(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null oowMessage");
        }
        this.b = iegVar;
    }

    public final void m(mxe mxeVar) {
        if (mxeVar == null) {
            throw new NullPointerException("Null selectedDistributor");
        }
        this.i = mxeVar;
    }

    public final void n(boolean z) {
        this.c = z;
        this.h = (byte) (this.h | 1);
    }

    public final void o(boolean z) {
        this.e = z;
        this.h = (byte) (this.h | 16);
    }

    public final void p(List list) {
        this.a = ImmutableList.copyOf((Collection) list);
    }
}
