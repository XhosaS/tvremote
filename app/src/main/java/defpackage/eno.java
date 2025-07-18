package defpackage;

import android.content.res.TypedArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eno extends enn {
    public eno() {
        this.a.p = false;
    }

    @Override // defpackage.enn
    public final /* bridge */ /* synthetic */ void b(TypedArray typedArray) {
        super.b(typedArray);
        int[] iArr = enl.a;
        if (typedArray.hasValue(2)) {
            enp enpVar = this.a;
            enpVar.e = (typedArray.getColor(2, enpVar.e) & 16777215) | (enpVar.e & (-16777216));
        }
        if (typedArray.hasValue(12)) {
            enp enpVar2 = this.a;
            enpVar2.d = typedArray.getColor(12, enpVar2.d);
        }
    }
}
