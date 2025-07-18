package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aakz implements aald {
    private final int a;
    private final aalc b;

    public aakz(int i, aalc aalcVar) {
        this.a = i;
        this.b = aalcVar;
    }

    @Override // defpackage.aald
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return aald.class;
    }

    @Override // defpackage.aald
    public final aalc b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aald)) {
            return false;
        }
        aald aaldVar = (aald) obj;
        return this.a == aaldVar.a() && this.b.equals(aaldVar.b());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }
}
