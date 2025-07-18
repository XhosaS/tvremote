package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hpu extends uua implements hhl, hhn {
    private static final zdy f = zdy.h("com/google/android/apps/tvsearch/results/searchlist/SearchRow");
    public final gnj c;
    public double d;
    public boolean e;
    private final gtu g;
    private int h;
    private String i;
    private int k;
    private int l;
    private int m;
    private adyn n;
    private final SparseArray o;
    private String p;
    private adyn q;
    private final SparseArray r;
    private int s;
    private int t;
    private int u;

    public hpu(gtu gtuVar, gnj gnjVar) {
        super(new hhm());
        this.k = 0;
        this.n = null;
        this.o = new SparseArray(2);
        this.r = new SparseArray();
        ((hhm) this.a).g = this;
        this.g = gtuVar;
        this.c = gnjVar;
    }

    private final void l() {
        adyn adynVar = this.q;
        this.n = adynVar;
        this.m = 0;
        this.l = adynVar.e.size();
    }

    @Override // defpackage.gkj
    public final int a() {
        return this.h;
    }

    @Override // defpackage.gkj
    public final /* synthetic */ pan b() {
        return null;
    }

    @Override // defpackage.gkj
    public final pan c() {
        return null;
    }

    @Override // defpackage.gkj
    public final String d() {
        return this.i;
    }

    @Override // defpackage.gkj
    public final String e() {
        return this.p;
    }

    @Override // defpackage.hhl
    public final int f() {
        return this.k;
    }

    @Override // defpackage.hhl
    public final hkk g(int i) {
        adyr adyrVar;
        SparseArray sparseArray = this.r;
        hpc hpcVar = (hpc) sparseArray.get(i);
        if (hpcVar != null) {
            return hpcVar;
        }
        if (this.n == null) {
            l();
        }
        int i2 = this.m;
        if (i >= i2 && i < this.l) {
            adyrVar = (adyr) this.n.e.get(i - i2);
        } else if (i < this.l) {
            while (true) {
                int i3 = this.m;
                if (i >= i3) {
                    adyrVar = (adyr) this.n.e.get(i - i3);
                    break;
                }
                int size = this.l - this.n.e.size();
                this.l = size;
                adyn adynVar = (adyn) this.o.get(size);
                this.n = adynVar;
                if (adynVar == null) {
                    l();
                    adyrVar = adyr.a;
                    break;
                }
                this.m = this.l - adynVar.e.size();
            }
        } else {
            while (true) {
                int i4 = this.l;
                if (i < i4) {
                    adyrVar = (adyr) this.n.e.get(i - this.m);
                    break;
                }
                this.m = i4;
                SparseArray sparseArray2 = this.o;
                int iIndexOfKey = sparseArray2.indexOfKey(i4) + 1;
                if (iIndexOfKey >= sparseArray2.size()) {
                    l();
                    adyrVar = adyr.a;
                    break;
                }
                int iKeyAt = sparseArray2.keyAt(iIndexOfKey);
                this.l = iKeyAt;
                adyn adynVar2 = (adyn) sparseArray2.get(iKeyAt);
                this.n = adynVar2;
                if (adynVar2 == null) {
                    l();
                    adyrVar = adyr.a;
                    break;
                }
            }
        }
        hpc hpcVar2 = new hpc(i, adyrVar, this.t, this.s, this.u != 3, this.p, this.g.c());
        sparseArray.append(i, hpcVar2);
        return hpcVar2;
    }

    @Override // defpackage.hhl
    public final String h() {
        adyn adynVar = this.q;
        if ((adynVar.b & 1024) == 0) {
            return "";
        }
        adzq adzqVar = adynVar.k;
        if (adzqVar == null) {
            adzqVar = adzq.a;
        }
        return adzqVar.b;
    }

    @Override // defpackage.hhl
    public final String i() {
        adyn adynVar = this.q;
        if ((adynVar.b & 1024) == 0) {
            return "";
        }
        adzq adzqVar = adynVar.k;
        if (adzqVar == null) {
            adzqVar = adzq.a;
        }
        return adzqVar.c;
    }

    @Override // defpackage.hhl
    public final boolean j() {
        return (this.q.b & 1024) != 0;
    }

    @Override // defpackage.hhn
    public final double k() {
        return this.d;
    }

    public final void o(Context context, adyn adynVar) {
        this.q = adynVar;
        int iA = adym.a(adynVar.c);
        if (iA == 0) {
            iA = 1;
        }
        this.u = iA;
        this.h = adynVar.i;
        this.i = adynVar.d.isEmpty() ? i() : adynVar.d;
        if ((adynVar.b & 64) != 0) {
            adzs adzsVar = adynVar.h;
            if (adzsVar == null) {
                adzsVar = adzs.a;
            }
            this.e = adzsVar.b;
            adzs adzsVar2 = adynVar.h;
            if (adzsVar2 == null) {
                adzsVar2 = adzs.a;
            }
            this.p = adzsVar2.c;
        }
        if (TextUtils.isEmpty(this.p) && adynVar.e.size() > 0 && (((adyr) adynVar.e.get(0)).b & 32) != 0) {
            adxv adxvVar = ((adyr) adynVar.e.get(0)).g;
            if (adxvVar == null) {
                adxvVar = adxv.a;
            }
            this.p = adxvVar.i;
        }
        int i = adynVar.g;
        int i2 = adynVar.f;
        if (i2 <= 0 || i <= 0) {
            this.t = context.getResources().getDimensionPixelSize(R.dimen.carousel_item_image_constant_height);
            this.s = context.getResources().getDimensionPixelSize(R.dimen.carousel_item_image_portrait_2_3_width);
        } else {
            this.t = i2;
            this.s = i;
        }
        int size = adynVar.e.size();
        if (size == 0) {
            ((zdv) ((zdv) f.c()).q("com/google/android/apps/tvsearch/results/searchlist/SearchRow", "addToSearchItems", 179, "SearchRow.java")).u("athome.List is empty");
        } else {
            int i3 = this.k + size;
            this.k = i3;
            this.o.append(i3, adynVar);
        }
        if (!this.e) {
            this.d = 1.0d;
            return;
        }
        double dB = this.c.b(this.p);
        this.d = dB;
        if (dB == 0.0d) {
            this.d = 0.5d;
        }
    }
}
