package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lcr {
    STORAGE(lcs.AD_STORAGE, lcs.ANALYTICS_STORAGE),
    DMA(lcs.AD_USER_DATA);

    public final lcs[] c;

    lcr(lcs... lcsVarArr) {
        this.c = lcsVarArr;
    }
}
