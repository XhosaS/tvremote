package defpackage;

import android.content.Context;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class owh implements ney {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ owh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ney
    public final nez[] a(Context context, nfc nfcVar) {
        if (this.b == 0) {
            context.getClass();
            return (nez[]) yfm.aI(new nep().a(context, nfcVar), new owi((owe) this.a, nfcVar));
        }
        nez[] nezVarArr = (nez[]) Arrays.copyOf(new nep().a(context, nfcVar), 20);
        nezVarArr[nezVarArr.length - 1] = new lnj((lnk) this.a);
        return nezVarArr;
    }
}
