package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nli extends ocg {
    private static final mru e;
    public final List a;
    final Bundle b;
    public int c;
    private static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<nli> CREATOR = new nld(4);

    static {
        mru mruVar = new mru();
        mruVar.d("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        mruVar.d("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        mruVar.d("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        mruVar.d("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        mruVar.d("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        mruVar.d("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        mruVar.d("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        mruVar.d("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        mruVar.d("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        mruVar.d("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        mruVar.d("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        mruVar.d("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        mruVar.d("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        mruVar.d("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        mruVar.d("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        mruVar.d("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        mruVar.d("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        mruVar.d("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        mruVar.d("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        mruVar.d("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        mruVar.d("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        mruVar.d("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        mruVar.d("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        mruVar.d("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        mruVar.d("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        mruVar.d("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        mruVar.d("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        mruVar.d("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        e = mruVar;
    }

    public nli(List list, Bundle bundle, int i) {
        this.a = list;
        this.b = bundle;
        this.c = i;
    }

    private final boolean e(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !e((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int iC = e.c(str);
        if (iC == 1 || iC == 0) {
            return this.b.getString(str);
        }
        throw new IllegalArgumentException("Value for " + str + " must be a " + d[1]);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.c);
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayB = nso.b(this.a);
        if (jSONArrayB.length() != 0) {
            try {
                jSONObject.put("images", jSONArrayB);
            } catch (JSONException unused2) {
            }
        }
        ArrayList<String> arrayList = new ArrayList();
        int i = this.c;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            for (String str : arrayList) {
                if (str != null) {
                    Bundle bundle = this.b;
                    if (bundle.containsKey(str)) {
                        mru mruVar = e;
                        String str2 = (String) mruVar.c.get(str);
                        if (str2 != null) {
                            int iC = mruVar.c(str);
                            if (iC != 1) {
                                if (iC == 2) {
                                    jSONObject.put(str2, bundle.getInt(str));
                                } else if (iC == 3) {
                                    jSONObject.put(str2, bundle.getDouble(str));
                                } else if (iC != 4) {
                                    if (iC == 5) {
                                        jSONObject.put(str2, nrv.a(bundle.getLong(str)));
                                    }
                                }
                            }
                            jSONObject.put(str2, bundle.getString(str));
                        }
                    }
                }
            }
            Bundle bundle2 = this.b;
            for (String str3 : bundle2.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj = bundle2.get(str3);
                    if (obj instanceof String) {
                        jSONObject.put(str3, obj);
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str3, obj);
                    } else if (obj instanceof Double) {
                        jSONObject.put(str3, obj);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
    public final void c(JSONObject jSONObject) {
        this.b.clear();
        this.a.clear();
        this.c = 0;
        try {
            this.c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            nso.c(this.a, jSONArrayOptJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.c;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && !"metadataType".equals(next)) {
                    mru mruVar = e;
                    String str = (String) mruVar.b.get(next);
                    if (str == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            this.b.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.b.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.b.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                int iC = mruVar.c(str);
                                if (iC != 1) {
                                    if (iC != 2) {
                                        if (iC == 3) {
                                            double dOptDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(dOptDouble)) {
                                                this.b.putDouble(str, dOptDouble);
                                            }
                                        } else if (iC != 4) {
                                            if (iC == 5) {
                                                this.b.putLong(str, nrv.c(jSONObject.optLong(next)));
                                            }
                                        } else if (obj2 instanceof String) {
                                            String str2 = (String) obj2;
                                            if (nso.a(str2) != null) {
                                                this.b.putString(str, str2);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.b.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.b.putString(str, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public final boolean d() {
        List list = this.a;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nli)) {
            return false;
        }
        nli nliVar = (nli) obj;
        return e(this.b, nliVar.b) && this.a.equals(nliVar.a);
    }

    public final int hashCode() {
        Bundle bundle = this.b;
        int iHashCode = 17;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (iHashCode * 31) + this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iV = ocv.v(parcel);
        ocv.S(parcel, 2, list);
        ocv.E(parcel, 3, this.b);
        ocv.B(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }

    public nli() {
        this(0);
    }

    public nli(int i) {
        this(new ArrayList(), new Bundle(), i);
    }
}
