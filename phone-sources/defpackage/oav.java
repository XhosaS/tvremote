package defpackage;

import android.accounts.Account;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oav {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final one g;
    public Integer h;

    public oav(Account account, Set set, Map map, String str, String str2, one oneVar) {
        this.a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = oneVar == null ? one.a : oneVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Object obj = ((kwy) it.next()).a;
            hashSet.addAll(null);
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
    }
}
