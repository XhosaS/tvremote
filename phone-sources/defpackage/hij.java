package defpackage;

import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hij {
    public int a;
    public int b;
    public String c;

    public final String toString() {
        int i = this.a;
        int i2 = hiy.a;
        ImmutableMap immutableMap = hix.p;
        Integer numValueOf = Integer.valueOf(i);
        return "Response Code: " + (!immutableMap.containsKey(numValueOf) ? hix.RESPONSE_CODE_UNSPECIFIED : (hix) immutableMap.get(numValueOf)).toString() + ", Debug Message: " + this.c;
    }
}
