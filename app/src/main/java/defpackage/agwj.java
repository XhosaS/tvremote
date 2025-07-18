package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agwj {
    public final String a(agvu agvuVar) {
        String string = agvuVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
