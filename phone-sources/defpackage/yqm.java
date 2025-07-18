package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yqm {
    public static final yxo a = new yxo("COMPLETING_ALREADY");
    public static final yxo b = new yxo("COMPLETING_WAITING_CHILDREN");
    public static final yxo c = new yxo("COMPLETING_RETRY");
    public static final yxo d = new yxo("TOO_LATE_TO_CANCEL");
    public static final yxo e = new yxo("SEALED");
    public static final ypo f = new ypo(false);
    public static final ypo g = new ypo(true);

    public static final Object a(Object obj) {
        return obj instanceof yqa ? new yqb((yqa) obj) : obj;
    }

    public static final Object b(Object obj) {
        yqa yqaVar;
        yqb yqbVar = obj instanceof yqb ? (yqb) obj : null;
        return (yqbVar == null || (yqaVar = yqbVar.a) == null) ? obj : yqaVar;
    }
}
