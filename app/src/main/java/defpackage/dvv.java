package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dvv {
    private static final HashSet a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("_changeset");
        hashSet.add("_firstlayout");
    }

    public dvv() {
        new HashSet();
        new HashSet();
    }

    public static boolean b(dvv dvvVar) {
        return dvvVar != null && dvvVar.a();
    }

    protected abstract boolean a();
}
