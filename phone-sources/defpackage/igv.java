package defpackage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igv {
    public final lie a;
    public final xjz b;
    public igs c;
    public final isi d;
    public final aafi e;
    private final Context f;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xcq] */
    public igv(Context context, isi isiVar, lie lieVar, xjz xjzVar) {
        isiVar.getClass();
        lieVar.getClass();
        this.f = context;
        this.d = isiVar;
        this.a = lieVar;
        this.b = xjzVar;
        aafi aafiVar = (aafi) ssr.r(context).d.b();
        aafiVar.getClass();
        this.e = aafiVar;
        aafiVar.o(this);
    }

    public static final vwe e() {
        vwe vweVarE = vxf.e(System.currentTimeMillis());
        vweVarE.getClass();
        return vweVarE;
    }

    public static final long f(vwe vweVar) {
        if (yks.e(vweVar, vwe.a)) {
            return 0L;
        }
        vtl vtlVarC = vxf.c(vweVar, e());
        vxd.g(vtlVarC);
        return vtlVarC.b / 86400;
    }

    public final long a() {
        return ((Long) xka.a.c(4, "InAppUpdateFeature__days_to_wait_for_auto_update", 3L).et(((xka) this.b).b)).longValue();
    }

    public final long b() {
        return ((Long) xka.a.c(6, "InAppUpdateFeature__number_of_flexible_prompts", 3L).et(((xka) this.b).b)).longValue();
    }

    public final long c() {
        return ((Long) xka.a.c(7, "InAppUpdateFeature__number_of_immediate_prompts", 3L).et(((xka) this.b).b)).longValue();
    }

    public final void d(int i, long j, long j2, int i2) {
        igs igsVar;
        tbb tbbVar = null;
        if (i == 2) {
            Object obj = this.c;
            if (obj != null) {
                int i3 = j2 == 0 ? 0 : (int) ((j * 100) / j2);
                tbb tbbVar2 = ((GtvHomePageActivity) obj).x;
                if (tbbVar2 == null) {
                    yks.c("appUpdateProgress");
                } else {
                    tbbVar = tbbVar2;
                }
                tbbVar.s(((AppCompatActivity) obj).getResources().getString(R.string.app_update_downloading_pct, Integer.valueOf(i3)));
                tbbVar.h();
                return;
            }
            return;
        }
        if (i == 11) {
            igs igsVar2 = this.c;
            if (igsVar2 != null) {
                tbb tbbVar3 = ((GtvHomePageActivity) igsVar2).x;
                if (tbbVar3 == null) {
                    yks.c("appUpdateProgress");
                } else {
                    tbbVar = tbbVar3;
                }
                tbbVar.r(R.string.app_update_downloaded);
                tbbVar.o(R.string.install, new jyr(igsVar2, 7));
                tbbVar.h();
                return;
            }
            return;
        }
        if (i != 5) {
            if (i == 6 && (igsVar = this.c) != null) {
                igsVar.b();
                return;
            }
            return;
        }
        ioc iocVar = this.d.i.g;
        if (iocVar == null) {
            iocVar = ioc.a;
        }
        iocVar.getClass();
        lie lieVar = this.a;
        int i4 = iocVar.d;
        int i5 = iocVar.f;
        vwe vweVar = iocVar.c;
        if (vweVar == null) {
            vweVar = vwe.a;
        }
        lieVar.aA(i4, i5, vweVar, 2, 5, i2);
        igs igsVar3 = this.c;
        if (igsVar3 != null) {
            igsVar3.e();
        }
    }
}
