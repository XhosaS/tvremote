package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebt extends Exception {
    public ebt(ebs ebsVar) {
        this("Unhandled input format:", ebsVar);
    }

    public ebt(String str, ebs ebsVar) {
        super(str + " " + String.valueOf(ebsVar));
    }
}
