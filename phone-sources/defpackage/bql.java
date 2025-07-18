package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bql {
    public String a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public List i;
    public List j;

    public bql() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
    }

    public /* synthetic */ bql(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        List list2 = (i & 256) != 0 ? brn.a : list;
        int i2 = i & 64;
        int i3 = i & 32;
        int i4 = i & 16;
        int i5 = i & 8;
        int i6 = i & 4;
        int i7 = i & 2;
        int i8 = i & 1;
        float f8 = (i & 128) != 0 ? 0.0f : f7;
        float f9 = i2 != 0 ? 0.0f : f6;
        float f10 = i3 != 0 ? 1.0f : f5;
        float f11 = i4 == 0 ? f4 : 1.0f;
        float f12 = i5 != 0 ? 0.0f : f3;
        f2 = i6 != 0 ? 0.0f : f2;
        f = i7 != 0 ? 0.0f : f;
        str = 1 == i8 ? "" : str;
        ArrayList arrayList = new ArrayList();
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f12;
        this.e = f11;
        this.f = f10;
        this.g = f9;
        this.h = f8;
        this.i = list2;
        this.j = arrayList;
    }
}
