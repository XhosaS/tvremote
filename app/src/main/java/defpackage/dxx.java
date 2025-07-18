package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dxx implements Cloneable {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dxx clone() {
        try {
            return (dxx) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void b(dxw dxwVar);
}
