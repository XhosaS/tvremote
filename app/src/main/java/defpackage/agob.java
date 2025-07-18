package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agob {
    public static final agob a;
    private static final /* synthetic */ agob[] b;

    static {
        agob agobVar = new agob();
        a = agobVar;
        b = new agob[]{agobVar};
    }

    private agob() {
    }

    public static boolean a(Object obj, agfs agfsVar) {
        if (obj == a) {
            agfsVar.a();
            return true;
        }
        if (obj instanceof agoa) {
            agfsVar.fe(((agoa) obj).a);
            return true;
        }
        agfsVar.c(obj);
        return false;
    }

    public static agob[] values() {
        return (agob[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
