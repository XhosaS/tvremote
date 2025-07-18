package defpackage;

import android.support.v7.appcompat.R;
import android.util.Log;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uum implements uha {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public uum(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj2;
        this.b = obj3;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.uha
    public final void a(Throwable th) {
        if (this.d == 0) {
            Log.e("ClientLoggingBackend", "Error while logging.", th);
            return;
        }
        if (th instanceof TimeoutException) {
            ((hif) this.c).D(R.styleable.AppCompatTheme_tooltipForegroundColor, 28, hik.B);
            hiy.f("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            ((hif) this.c).D(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 28, hik.B);
            hiy.f("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.b.run();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [cuh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.uha
    public final /* synthetic */ void b(Object obj) {
        if (this.d == 0) {
            if (((Boolean) obj).booleanValue()) {
                sfy.K(this.a, trc.e(new rhx(this, this.b, 4)), ugk.a);
                return;
            }
            return;
        }
        Integer num = (Integer) obj;
        if (!hif.B(num.intValue())) {
            this.b.run();
            return;
        }
        this.a.accept(((hif) this.c).C(7, num.intValue()));
    }
}
