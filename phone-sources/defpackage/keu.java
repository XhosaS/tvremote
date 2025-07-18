package defpackage;

import com.google.android.apps.googletv.app.presentation.pages.search.v2.SearchQueryPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.virtualremote.activities.VirtualRemoteActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class keu implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ keu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [cdv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v58, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [brs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, yfo] */
    @Override // defpackage.yjk
    public final Object a() {
        isy isyVar = null;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                bit bitVarT = bcm.t();
                yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
                bit bitVarU = bcm.u(bitVarT);
                try {
                    if (((Boolean) ((aid) obj).b.a()).booleanValue()) {
                        wv.d("TextFieldState does not support concurrent or nested editing.");
                    }
                    aid aidVar = (aid) obj;
                    aidVar.e(true);
                    ahw ahwVar = new ahw(aidVar.b());
                    try {
                        ahwVar.e(0, ahwVar.a(), "");
                        int iA = ahwVar.a();
                        int iA2 = ahwVar.a() + 1;
                        if (iA < 0 || iA >= iA2) {
                            wv.c("Expected " + iA + " to be in [0, " + iA2 + ')');
                        }
                        long jN = ccf.N(iA, iA);
                        long j = chb.a;
                        ahwVar.b = jN;
                        boolean z = ahwVar.b().a() > 0;
                        boolean zS = a.s(ahwVar.b, ((aid) obj).a.b);
                        if (z) {
                            ((aid) obj).e.j();
                        }
                        ahx ahxVarI = ahw.i(((aid) obj).a);
                        if (z) {
                            ((aid) obj).a = new ahw(new ahx(ahwVar.toString(), ahwVar.b, null, null, null, 60));
                        } else if (!zS) {
                            ahw ahwVar2 = ((aid) obj).a;
                            long j2 = ahwVar.b;
                            ahwVar2.g(ccf.N(chb.e(j2), chb.a(j2)));
                        }
                        if (z || !zS || !yks.e(ahxVarI.e, ahwVar.c)) {
                            ((aid) obj).a.d();
                        }
                        ((aid) obj).f(ahxVarI, ahw.i(((aid) obj).a), true);
                        aidVar.d();
                        return ygi.a;
                    } catch (Throwable th) {
                        aidVar.d();
                        throw th;
                    }
                } finally {
                    bcm.z(bitVarT, bitVarU, yjvVarI);
                }
            case 1:
                return a.al((dwi) this.a);
            case 2:
                return Boolean.valueOf(this.a.d());
            case 3:
                return ((aid) this.a).c();
            case 4:
                this.a.b(Boolean.valueOf(false));
                return ygi.a;
            case 5:
                this.a.b(Boolean.valueOf(true));
                return ygi.a;
            case 6:
                return a.w(this.a);
            case 7:
                ((SearchQueryPageActivity) this.a).finish();
                return ygi.a;
            case 8:
                ((SearchQueryPageActivity) this.a).finish();
                return ygi.a;
            case 9:
                ((kej) this.a).b();
                return ygi.a;
            case 10:
                isy isyVar2 = ((kfh) this.a).k;
                if (isyVar2 == null) {
                    yks.c("searchSuggestionsDataSourceFactory");
                } else {
                    isyVar = isyVar2;
                }
                mta mtaVar = (mta) isyVar.a.b();
                mtaVar.getClass();
                iea ieaVarB = ((kqg) isyVar.c).b();
                yow yowVarB = ((kqw) isyVar.b).b();
                yow yowVar = (yow) isyVar.d.b();
                yowVar.getClass();
                return new jto(mtaVar, ieaVarB, yowVarB, yowVar);
            case 11:
                return a.al((dwi) this.a);
            case 12:
                ((VirtualRemoteActivity) this.a).finish();
                return ygi.a;
            case 13:
                return Float.valueOf(((Number) this.a.a()).floatValue());
            case 14:
                this.a.a(0);
                return ygi.a;
            case 15:
                this.a.a(kgb.a);
                return ygi.a;
            case 16:
                ((kiq) this.a).b(kgi.a);
                return ygi.a;
            case 17:
                ((kiq) this.a).b(kgc.a);
                return ygi.a;
            case 18:
                ((kiq) this.a).b(kge.a);
                return ygi.a;
            case 19:
                ((kiq) this.a).b(kgh.a);
                return ygi.a;
            default:
                ((kiq) this.a).b(kgb.a);
                return ygi.a;
        }
    }
}
