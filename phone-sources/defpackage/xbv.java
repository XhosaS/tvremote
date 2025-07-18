package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xbv implements vug {
    UNKNOWN(0),
    CHOOSIES_CAMPAIGN_ID(1),
    COLLECTION_ID(2),
    APP_GENERATED_ID(3),
    FIREBALL_TAG_ID(4),
    FIREBALL_SELECTED_TAG_IDS(5),
    GENRE_TAG_ID(6),
    GENRE_SELECTED_TAG_IDS(7),
    LIBRARY_SORT_PREFERENCE(8),
    LIBRARY_TAB_ID(9);

    public final int k;

    xbv(int i) {
        this.k = i;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
