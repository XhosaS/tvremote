package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lhu {
    public final String a;
    public final lex b;
    public final lls c;
    private final Map d;

    public lhu(String str, Map map, lex lexVar, lls llsVar) {
        this.a = str;
        this.d = map;
        this.b = lexVar;
        this.c = llsVar;
    }

    public final Map a() {
        Map map = this.d;
        return map == null ? Collections.EMPTY_MAP : map;
    }
}
