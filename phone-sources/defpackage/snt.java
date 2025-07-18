package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snt implements TypeEvaluator {
    public static final Integer a(float f, Integer num, Integer num2) {
        int iIntValue = num.intValue() >> 24;
        int iIntValue2 = num2.intValue() >> 24;
        float fPow = (float) Math.pow(((r12 >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((r12 >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((r12 & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((r13 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((r13 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((r13 & 255) / 255.0f, 2.2d);
        float f2 = (iIntValue & 255) / 255.0f;
        return Integer.valueOf((Math.round((f2 + (f * (((iIntValue2 & 255) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(fPow2 + ((fPow5 - fPow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow3 + ((fPow6 - fPow3) * f), 0.45454545454545453d)) * 255.0f));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return a(f, (Integer) obj, (Integer) obj2);
    }
}
