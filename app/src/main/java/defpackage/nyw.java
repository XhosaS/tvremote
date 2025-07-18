package defpackage;

import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import com.google.android.libraries.elements.interfaces.MaterializationResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyw extends oak {
    private boolean A;
    public WeakReference a;
    public int b;
    public int c;
    public int d;
    public ofl e;
    public aghb f;
    public boolean g;
    public StringBuilder h;
    public String i;
    public String j;
    public WeakReference k;
    public obj l;
    public String m;
    public String n;
    public ocj o;
    public AtomicReference p;
    public MaterializationResult q;
    public String r;
    public String s;
    public String t;
    public BlockRegistryProvider u;
    public short v;
    private WeakReference w;
    private boolean x;
    private boolean y;
    private int z;

    public nyw() {
    }

    @Override // defpackage.oak
    public final oal a() {
        if (this.v == 1023 && this.i != null && this.j != null) {
            return new nyx(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.w, this.k, this.l, null, null, false, this.o, this.y, this.z, this.p, this.q, null, null, this.A, this.t, this.u);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.v & 1) == 0) {
            sb.append(" gridRowIndex");
        }
        if ((this.v & 2) == 0) {
            sb.append(" gridColumnCount");
        }
        if ((this.v & 4) == 0) {
            sb.append(" gridColumnIndex");
        }
        if ((this.v & 8) == 0) {
            sb.append(" imagePrefetchRangeRatio");
        }
        if ((this.v & 16) == 0) {
            sb.append(" useIncrementalMountOnChildrenInternal");
        }
        if ((this.v & 32) == 0) {
            sb.append(" useLegacyVisibleInternal");
        }
        if (this.i == null) {
            sb.append(" elementId");
        }
        if (this.j == null) {
            sb.append(" identifierProperty");
        }
        if ((this.v & 64) == 0) {
            sb.append(" shouldAddDebuggerViewTags");
        }
        if ((this.v & 128) == 0) {
            sb.append(" couldOverlapWithElementsConfig");
        }
        if ((this.v & 256) == 0) {
            sb.append(" elementDepthInTree");
        }
        if ((this.v & 512) == 0) {
            sb.append(" enableDroppedFrameLogging");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.oak
    protected final void b(boolean z) {
        this.y = z;
        this.v = (short) (this.v | 128);
    }

    @Override // defpackage.oak
    public final void c(int i) {
        this.z = i;
        this.v = (short) (this.v | 256);
    }

    @Override // defpackage.oak
    public final void d(boolean z) {
        this.A = z;
        this.v = (short) (this.v | 512);
    }

    @Override // defpackage.oak
    protected final void e(WeakReference weakReference) {
        this.w = weakReference;
    }

    @Override // defpackage.oak
    public final void f(boolean z) {
        this.x = false;
        this.v = (short) (this.v | 64);
    }

    public nyw(oal oalVar) {
        nyx nyxVar = (nyx) oalVar;
        this.a = nyxVar.a;
        this.b = nyxVar.b;
        this.c = nyxVar.c;
        this.d = nyxVar.d;
        this.e = nyxVar.e;
        this.f = nyxVar.f;
        this.g = nyxVar.g;
        this.h = nyxVar.h;
        this.i = nyxVar.i;
        this.j = nyxVar.j;
        this.w = nyxVar.k;
        this.k = nyxVar.l;
        this.l = nyxVar.m;
        this.m = null;
        this.n = null;
        this.x = false;
        this.o = nyxVar.q;
        this.y = nyxVar.r;
        this.z = nyxVar.s;
        this.p = nyxVar.t;
        this.q = nyxVar.u;
        this.r = null;
        this.s = null;
        this.A = nyxVar.x;
        this.t = nyxVar.y;
        this.u = nyxVar.z;
        this.v = (short) 1023;
    }
}
