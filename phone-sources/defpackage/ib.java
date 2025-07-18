package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ib implements DialogInterface.OnClickListener {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public ib(ic icVar, int i, byte[] bArr) {
        this.b = i;
        this.a = new WeakReference(icVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b != 0) {
            WeakReference weakReference = this.a;
            if (weakReference.get() != null) {
                ((ic) weakReference.get()).k(true);
                return;
            }
            return;
        }
        WeakReference weakReference2 = this.a;
        if (weakReference2.get() != null) {
            ((ic) weakReference2.get()).l(true);
        }
    }

    public ib(ic icVar, int i) {
        this.b = i;
        this.a = new WeakReference(icVar);
    }
}
