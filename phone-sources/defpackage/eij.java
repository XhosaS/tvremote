package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eij implements ttm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eij(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, ldv] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, lfn] */
    @Override // defpackage.ttm
    public final Object get() {
        switch (this.b) {
            case 0:
                return this.a;
            case 1:
                return dvb.i((Context) this.a);
            case 2:
                return new eig((Context) this.a);
            case 3:
                return new evm((Context) this.a, new fdl());
            case 4:
                return this.a;
            case 5:
                return new evm((Context) this.a, new fdl());
            case 6:
                return this.a;
            case 7:
                return new ezd((Context) this.a, new eyi());
            case 8:
                return ezq.f((Context) this.a);
            case 9:
                return this.a;
            case 10:
                try {
                    return (evy) ((Class) this.a).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 11:
                return ((sea) this.a).h;
            case 12:
                ?? r0 = this.a;
                return tst.h(r0.b(r0.g()));
            case 13:
                return tst.i(this.a);
            case 14:
                return Boolean.valueOf(this.a.dg());
            case 15:
                return Boolean.valueOf(this.a.cS());
            case 16:
                return new nim((Context) this.a);
            case 17:
                npj npjVar = oen.a;
                return new oer((Activity) this.a);
            case 18:
                return new ocv((Context) ((ntp) this.a).a);
            case 19:
                return (pru) ((AtomicReference) this.a).get();
            default:
                return (prv) ((AtomicReference) this.a).get();
        }
    }
}
