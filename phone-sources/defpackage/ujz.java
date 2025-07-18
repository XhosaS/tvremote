package defpackage;

import android.os.Parcel;
import android.util.Log;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ujz extends oag {
    final /* synthetic */ uka a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujz(uka ukaVar) {
        super(null, false, 9002);
        this.a = ukaVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.oag
    protected final /* bridge */ /* synthetic */ void a(nwf nwfVar, kwy kwyVar) {
        ukc ukcVar = (ukc) ((ujw) nwfVar).L();
        ujy ujyVar = new ujy(this, kwyVar);
        nwl nwlVar = nwl.a;
        Parcel parcelK = ukcVar.k();
        ifl.e(parcelK, ujyVar);
        uka ukaVar = this.a;
        ifl.c(parcelK, ukaVar.a);
        ifl.c(parcelK, nwlVar);
        Parcel parcelL = ukcVar.l(8, parcelK);
        ujx ujxVar = (ujx) ifl.a(parcelL, ujx.CREATOR);
        parcelL.recycle();
        int i = ujxVar == null ? 2 : ujxVar.a;
        boolean z = true;
        uka ukaVar2 = null;
        if (i != 3) {
            if (i != 1) {
                String strCf = a.cf(i, "API call failed. Status code: ");
                if (Log.isLoggable("FirebaseAppIndex", 6) || Log.isLoggable("FirebaseAppIndex", 6)) {
                    Log.e("FirebaseAppIndex", strCf);
                }
                if (kwyVar.w(null)) {
                    ((kwy) this.a.c).t(new ujn("Indexing error."));
                }
            }
            uka ukaVar3 = this.a;
            Object obj = ukaVar3.b;
            Queue queue = ((ukb) obj).b;
            synchronized (queue) {
                if (((uka) queue.poll()) != ukaVar3) {
                    z = false;
                }
                a.ab(z);
                ukaVar2 = (uka) queue.peek();
                ((ukb) obj).c = 0;
            }
        } else if (kwyVar.w(null)) {
            Object obj2 = ukaVar.b;
            Queue queue2 = ((ukb) obj2).b;
            synchronized (queue2) {
                if (((ukb) obj2).c == 0) {
                    uka ukaVar4 = (uka) queue2.peek();
                    a.ab(ukaVar4 == ukaVar);
                    ukaVar2 = ukaVar4;
                } else {
                    ((ukb) obj2).c = 2;
                }
            }
        }
        if (ukaVar2 != null) {
            ukaVar2.a();
        }
    }
}
