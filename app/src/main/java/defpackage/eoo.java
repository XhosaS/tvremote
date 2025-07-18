package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoo {
    public final String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
