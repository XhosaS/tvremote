package defpackage;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mgm implements Comparator {
    protected abstract float a(mgl mglVar, mgl mglVar2);

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        mgl mglVar = (mgl) obj;
        mgl mglVar2 = (mgl) obj2;
        if (mglVar == mglVar2) {
            return 0;
        }
        if (mglVar == null) {
            return -1;
        }
        if (mglVar2 == null) {
            return 1;
        }
        return (int) Math.signum(a(mglVar, mglVar2));
    }
}
