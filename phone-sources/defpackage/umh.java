package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umh implements uml {
    private final int a;
    private final umk b;

    public umh(int i, umk umkVar) {
        this.a = i;
        this.b = umkVar;
    }

    @Override // defpackage.uml
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return uml.class;
    }

    @Override // defpackage.uml
    public final umk b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uml)) {
            return false;
        }
        uml umlVar = (uml) obj;
        return this.a == umlVar.a() && this.b.equals(umlVar.b());
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
