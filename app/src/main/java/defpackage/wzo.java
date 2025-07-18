package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzo implements wzl {
    @Override // defpackage.wzl
    public final wzm a(wzp wzpVar) {
        wzm wzmVar;
        synchronized (wzpVar) {
            wzmVar = wzpVar.currentMetadata;
        }
        return wzmVar;
    }

    @Override // defpackage.wzl
    public final boolean b(wzp wzpVar, wzm wzmVar, wzm wzmVar2) {
        synchronized (wzpVar) {
            if (wzpVar.currentMetadata != wzmVar) {
                return false;
            }
            wzpVar.currentMetadata = wzmVar2;
            return true;
        }
    }
}
