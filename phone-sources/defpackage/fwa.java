package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
@fxn(a = "activity")
/* loaded from: classes.dex */
public class fwa extends fxo<fvz> {
    private final Context c;
    private final Activity d;

    public fwa(Context context) {
        Object next;
        this.c = context;
        Iterator itA = ykr.h(context, new cjp(14)).a();
        while (true) {
            if (!itA.hasNext()) {
                next = null;
                break;
            } else {
                next = itA.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) next;
    }

    @Override // defpackage.fxo
    public final /* synthetic */ fxb a() {
        return new fvz(this);
    }

    @Override // defpackage.fxo
    public final boolean b() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // defpackage.fxo
    public final /* bridge */ /* synthetic */ fxb c(fxb fxbVar) {
        throw new IllegalStateException("Destination " + ((fvz) fxbVar).b() + " does not have an Intent set.");
    }
}
