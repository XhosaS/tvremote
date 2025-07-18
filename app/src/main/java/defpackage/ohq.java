package defpackage;

import android.os.Trace;
import android.util.SparseArray;
import j$.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ohq implements nzm {
    public static final SparseArray b;
    public final int c;
    public final long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    private final ohr k;
    private final oin l;
    private final Executor n;
    private final String o;
    private int r;
    private final String s;
    private int p = -1;
    public boolean d = false;
    private String q = null;
    private final oif m = oie.a();
    private final Boolean t = false;

    static {
        SparseArray sparseArray = new SparseArray();
        b = sparseArray;
        sparseArray.put(16, oij.FIRST_ROOT_PREPARATION);
        sparseArray.put(6, oij.ROOT_MOUNTING);
        sparseArray.put(22, oij.ROOT_PERFORM_LAYOUT);
        sparseArray.put(23, oij.ROOT_ON_MEASURE);
    }

    public ohq(int i, String str, ohr ohrVar, oin oinVar, Executor executor, dru druVar) {
        this.r = -1;
        this.c = i;
        this.k = ohrVar;
        this.n = executor;
        this.l = oinVar;
        this.e = ((tmt) ohrVar).a.a() / 1000;
        this.o = str;
        this.s = (String) Map.EL.getOrDefault(eev.a(druVar), "Component name", "");
        this.r = -1;
    }

    @Override // defpackage.dxc
    public final void a(String str, int i) {
        if (this.c == 6 && str.equals("treeId")) {
            this.r = i;
        }
    }

    @Override // defpackage.dxc
    public final void b(String str, String str2) {
        if ("CellLogId".equals(str)) {
            try {
                this.p = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                this.p = -1;
            }
        } else if ("CELL_NODE_ID".equals(str)) {
            this.q = str2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.dxc
    public final void c(String str) {
        if (this.c != 16) {
        }
        switch (str.hashCode()) {
            case -2086025552:
                if (str.equals("start_create_layout")) {
                    Trace.beginSection("CSI:FirstRootMaterialization: CellPerformanceLoggerImpl");
                    this.i = ((tmt) this.k).a.a() / 1000;
                    this.j = -1L;
                    break;
                }
                break;
            case -935948671:
                if (str.equals("start_measure")) {
                    Trace.beginSection("CSI:FirstRootMeasurement: CellPerformanceLoggerImpl");
                    this.g = ((tmt) this.k).a.a() / 1000;
                    this.h = -1L;
                    break;
                }
                break;
            case 749650793:
                if (str.equals("end_create_layout")) {
                    Trace.endSection();
                    this.j = ((tmt) this.k).a.a() / 1000;
                    break;
                }
                break;
            case 1694616058:
                if (str.equals("end_measure")) {
                    Trace.endSection();
                    this.h = ((tmt) this.k).a.a() / 1000;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.nzm
    public final void d() {
        this.d = true;
    }

    @Override // defpackage.nzm
    public final void e() {
        this.f = ((tmt) this.k).a.a() / 1000;
        this.n.execute(new Runnable() { // from class: ohp
            @Override // java.lang.Runnable
            public final void run() {
                ohq ohqVar = this.a;
                if (ohqVar.d) {
                    return;
                }
                oij oijVar = (oij) ohq.b.get(ohqVar.c);
                ohqVar.g(oijVar == null ? oij.UNKNOWN.w : oijVar.w, ohqVar.e, ohqVar.f);
                long j = ohqVar.i;
                if (j > 0) {
                    long j2 = ohqVar.j;
                    if (j2 > 0) {
                        ohqVar.g(oij.FIRST_ROOT_MATERIALIZATION.w, j, j2);
                    }
                }
                long j3 = ohqVar.g;
                if (j3 > 0) {
                    long j4 = ohqVar.h;
                    if (j4 > 0) {
                        ohqVar.g(oij.FIRST_ROOT_MEASUREMENT.w, j3, j4);
                    }
                }
            }
        });
    }

    @Override // defpackage.nzm
    public final boolean f() {
        return !this.d;
    }

    public final void g(String str, long j, long j2) {
        oih oihVarN = oii.n();
        ohn ohnVar = (ohn) oihVarN;
        ohnVar.b = this.m;
        String str2 = this.s;
        if (str2 != null) {
            ohnVar.a = new zdd(str2);
        }
        String str3 = this.q;
        if (str3 != null) {
            ohnVar.c = str3;
        }
        this.t.booleanValue();
        if (this.r >= 0 && str.equals(oij.ROOT_MOUNTING.w)) {
            ohnVar.d = Integer.valueOf(this.r);
        }
        ohl ohlVar = new ohl();
        ohlVar.b(str);
        ohlVar.a = Long.valueOf(j);
        ohlVar.b = Long.valueOf(j2);
        ohlVar.d = oihVarN.a();
        oik oikVarA = ohlVar.a();
        int i = this.p;
        if (i > 0) {
            this.l.c(this.o, i, oikVarA);
        } else {
            this.l.d(this.o, oikVarA);
        }
    }
}
