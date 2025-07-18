package defpackage;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uns {
    public final agum a;
    public final agum b;
    public final agum c;
    public final agum d;
    public final Set e = new LinkedHashSet();
    private final Random f;

    public uns(agum agumVar, agum agumVar2, agum agumVar3, agum agumVar4, Random random) {
        this.a = agumVar;
        this.b = agumVar2;
        this.c = agumVar3;
        this.d = agumVar4;
        this.f = random;
    }

    public final boolean a(int i) {
        return i > 0 && this.f.nextInt(i) == 0;
    }
}
