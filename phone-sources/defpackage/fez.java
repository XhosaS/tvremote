package defpackage;

import android.support.v7.widget.ActivityChooserView;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fez implements fdp {
    private final /* synthetic */ int a;
    private final Object b;

    public fez(int i) {
        this.a = i;
        this.b = new feh(16973, 2, "image/bmp");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fdp, java.lang.Object] */
    @Override // defpackage.fdp
    public final void c() {
        if (this.a != 2) {
            return;
        }
        this.b.c();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fdp, java.lang.Object] */
    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        int i = this.a;
        if (i == 0) {
            ((feh) this.b).d(j, j2);
        } else if (i != 1) {
            if (i != 2) {
                ((feh) this.b).d(j, j2);
            } else {
                this.b.d(j, j2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fdp, java.lang.Object] */
    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        int i = this.a;
        if (i == 0) {
            return ((feh) this.b).e(fdqVar);
        }
        if (i != 1) {
            return i != 2 ? ((feh) this.b).e(fdqVar) : this.b.e(fdqVar);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fdp, java.lang.Object] */
    @Override // defpackage.fdp
    public final int g(fdq fdqVar, rsj rsjVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? ((feh) this.b).g(fdqVar, rsjVar) : this.b.g(fdqVar, rsjVar) : fdqVar.c(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) == -1 ? -1 : 0 : ((feh) this.b).g(fdqVar, rsjVar);
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? ImmutableList.of() : ImmutableList.of() : ImmutableList.of() : ImmutableList.of();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [fdp, java.lang.Object] */
    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        int i = this.a;
        if (i == 0) {
            ((feh) this.b).y(fdrVar);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                ((feh) this.b).y(fdrVar);
                return;
            } else {
                this.b.y(fdrVar);
                return;
            }
        }
        fel felVarDq = fdrVar.dq(0, 3);
        fdrVar.r(new fee(-9223372036854775807L));
        fdrVar.j();
        dze dzeVar = (dze) this.b;
        dzd dzdVar = new dzd(dzeVar);
        dzdVar.d("text/x-unknown");
        dzdVar.j = dzeVar.Y;
        felVarDq.b(new dze(dzdVar));
    }

    public fez(int i, char[] cArr) {
        this.a = i;
        this.b = new feh(35152, 2, "image/png");
    }

    public fez(dze dzeVar, int i) {
        this.a = i;
        this.b = dzeVar;
    }

    public fez(int i, int i2) {
        this.a = i2;
        this.b = i != 0 ? new feh(65496, 2, "image/jpeg") : new ffk();
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
