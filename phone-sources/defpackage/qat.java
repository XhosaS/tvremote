package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qat extends Exception {
    public qat(String str, Throwable th) {
        super("Column not found:".concat(str), th);
    }
}
