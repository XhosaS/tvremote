package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.media.Rating;
import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htf extends hkk implements Comparable {
    public static final hte a = new hte();
    private static final zdy m = zdy.h("com/google/android/apps/tvsearch/results/systemsearch/SystemSearchItem");
    public final Duration e;
    public int f;
    public int g;
    public final String h;
    public final Intent i;
    public final String j;
    public final int k;
    public final String l;
    private final boolean n;
    private final double o;
    private final String p;
    private final boolean q;
    private final int r;
    private final Rating s;
    private final int t;
    private final int u;
    private final int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htf(int i, jba jbaVar, Cursor cursor) throws NumberFormatException {
        double d;
        Rating ratingNewHeartRating;
        String strH;
        int columnIndex;
        String string;
        String string2;
        super(i);
        jbaVar.getClass();
        this.n = true;
        try {
            String str = "1.0";
            int columnIndex2 = cursor.getColumnIndex("suggest_audio_channel_config");
            if (columnIndex2 >= 0 && (string2 = cursor.getString(columnIndex2)) != null) {
                str = string2;
            }
            d = Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            d = 1.0d;
        }
        this.o = d;
        int columnIndex3 = cursor.getColumnIndex("suggest_duration");
        Duration durationOfMillis = Duration.ofMillis(columnIndex3 >= 0 ? cursor.getLong(columnIndex3) : 0L);
        durationOfMillis.getClass();
        this.e = durationOfMillis;
        this.q = true;
        this.j = jbaVar.i();
        hte hteVar = a;
        this.k = hteVar.b(cursor, "suggest_production_year", 0);
        this.r = hteVar.b(cursor, "progress_bar_percentage", -1);
        int iB = hteVar.b(cursor, "suggest_rating_style", 0);
        switch (iB) {
            case 1:
                ratingNewHeartRating = Rating.newHeartRating(hteVar.c(cursor));
                break;
            case 2:
                ratingNewHeartRating = Rating.newThumbRating(hteVar.c(cursor));
                break;
            case 3:
            case 4:
            case 5:
                float fA = hteVar.a(cursor);
                float f = 3.0f;
                if (iB != 3) {
                    if (iB == 4) {
                        f = 4.0f;
                    } else if (iB == 5) {
                        f = 5.0f;
                    }
                }
                if (fA < 0.0f) {
                    fA = 0.0f;
                } else if (fA > f) {
                    fA = f;
                }
                ratingNewHeartRating = Rating.newStarRating(iB, fA);
                break;
            case 6:
                ratingNewHeartRating = Rating.newPercentageRating(hteVar.a(cursor));
                break;
            default:
                ratingNewHeartRating = null;
                break;
        }
        this.s = ratingNewHeartRating;
        this.t = 13891;
        this.u = hteVar.b(cursor, "suggest_video_height", 320);
        this.v = hteVar.b(cursor, "suggest_video_width", 480);
        int columnIndex4 = cursor.getColumnIndex("suggest_text_1");
        int columnIndex5 = cursor.getColumnIndex("suggest_text_2");
        String string3 = "";
        if (columnIndex4 == -1 || cursor.getType(columnIndex4) != 3) {
            if (columnIndex5 != -1) {
                String string4 = cursor.getString(columnIndex5);
                string4.getClass();
                this.l = string4;
            } else {
                this.l = "";
            }
            this.p = null;
        } else {
            String string5 = cursor.getString(columnIndex4);
            string5.getClass();
            this.l = string5;
            this.p = columnIndex5 != -1 ? cursor.getString(columnIndex5) : null;
        }
        int columnIndex6 = cursor.getColumnIndex("suggest_result_card_image");
        int columnIndex7 = cursor.getColumnIndex("suggest_icon_1");
        columnIndex6 = columnIndex6 == -1 ? columnIndex7 != -1 ? columnIndex7 : cursor.getColumnIndex("suggest_icon_2") : columnIndex6;
        if (columnIndex6 != -1) {
            int type = cursor.getType(columnIndex6);
            if (type != 0) {
                if (type == 1) {
                    string3 = "android.resource://" + jbaVar.i() + "/" + cursor.getInt(columnIndex6);
                } else if (type != 3) {
                    ((zdv) m.d().q("com/google/android/apps/tvsearch/results/systemsearch/SystemSearchItem", "<init>", 141, "SystemSearchItem.kt")).v("Unhandled content type (%d) for image.", cursor.getType(columnIndex6));
                } else {
                    string3 = cursor.getString(columnIndex6);
                    string3.getClass();
                }
            }
        } else {
            ((zdv) m.d().q("com/google/android/apps/tvsearch/results/systemsearch/SystemSearchItem", "<init>", 146, "SystemSearchItem.kt")).u("No column for the image.");
        }
        this.h = string3;
        int columnIndex8 = cursor.getColumnIndex("suggest_intent_action");
        Intent intent = columnIndex8 != -1 ? new Intent(cursor.getString(columnIndex8)) : new Intent(jbaVar.g());
        this.i = intent;
        int columnIndex9 = cursor.getColumnIndex("suggest_intent_data");
        if (columnIndex9 == -1 || (strH = cursor.getString(columnIndex9)) == null) {
            strH = jbaVar.h();
        }
        if (strH != null && (columnIndex = cursor.getColumnIndex("suggest_intent_data_id")) != -1 && (string = cursor.getString(columnIndex)) != null) {
            strH = ((Object) strH) + "/" + string;
        }
        int columnIndex10 = cursor.getColumnIndex("suggest_intent_extra_data");
        if (columnIndex10 != -1) {
            int type2 = cursor.getType(columnIndex10);
            if (type2 == 1) {
                intent.putExtra("intent_extra_data_key", cursor.getInt(columnIndex10)).getClass();
            } else if (type2 == 2) {
                intent.putExtra("intent_extra_data_key", cursor.getFloat(columnIndex10)).getClass();
            } else if (type2 == 3) {
                intent.putExtra("intent_extra_data_key", cursor.getString(columnIndex10)).getClass();
            } else if (type2 == 4) {
                intent.putExtra("intent_extra_data_key", cursor.getBlob(columnIndex10)).getClass();
            }
        }
        intent.setPackage(jbaVar.i());
        intent.setComponent(jbaVar.b());
        intent.addFlags(335544320);
        try {
            intent.setData(Uri.parse(strH));
        } catch (Exception e) {
            ((zdv) ((zdv) m.c()).p(e).q("com/google/android/apps/tvsearch/results/systemsearch/SystemSearchItem", "<init>", 199, "SystemSearchItem.kt")).u("wrong intent data format");
        }
    }

    @Override // defpackage.hkk
    public final int a() {
        return this.f;
    }

    @Override // defpackage.hkk
    public final int b() {
        return this.g;
    }

    @Override // defpackage.hkk
    public final int c() {
        return this.t;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        htf htfVar = (htf) obj;
        htfVar.getClass();
        if (this == htfVar) {
            return 0;
        }
        int i = (this.v * this.u) - (htfVar.v * htfVar.u);
        if (i != 0) {
            return i;
        }
        double d = this.o;
        double d2 = htfVar.o;
        if (d > d2) {
            return 1;
        }
        if (d < d2) {
            return -1;
        }
        Rating rating = this.s;
        if (rating == null || htfVar.s != null) {
            return (rating != null || htfVar.s == null) ? 0 : -1;
        }
        return 1;
    }

    @Override // defpackage.hkk
    public final Intent d() {
        return this.i;
    }

    @Override // defpackage.hkk
    public final Duration e() {
        return this.e;
    }

    @Override // defpackage.hkk, defpackage.gki
    public final String f() {
        return this.l;
    }

    @Override // defpackage.hkk
    public final String g() {
        return this.h;
    }

    @Override // defpackage.hkk
    public final boolean h() {
        return this.h.length() > 0;
    }

    @Override // defpackage.hkk, defpackage.gki
    public final String l() {
        return this.j;
    }

    @Override // defpackage.hkk, defpackage.gki
    public final boolean m() {
        return this.q;
    }

    @Override // defpackage.hkk
    public final int n() {
        return this.r;
    }

    @Override // defpackage.hkk
    public final String q() {
        return this.p;
    }

    @Override // defpackage.hkk
    public final boolean w() {
        return this.n;
    }

    @Override // defpackage.hkk
    public final boolean x() {
        return this.p != null;
    }
}
