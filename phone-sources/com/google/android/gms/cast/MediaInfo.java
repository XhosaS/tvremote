package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.common.collect.ImmutableList;
import defpackage.njw;
import defpackage.njx;
import defpackage.nlf;
import defpackage.nli;
import defpackage.nmb;
import defpackage.nmc;
import defpackage.nrv;
import defpackage.ocg;
import defpackage.oct;
import defpackage.ocv;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaInfo extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;
    public int a;
    public String b;
    public nli c;
    public long d;
    public List e;
    public nmb f;
    String g;
    public String h;
    public nmc i;
    public long j;
    public String k;
    public String l;
    public String m;
    public String n;
    public JSONObject o;
    private String p;
    private List q;
    private List r;

    static {
        Pattern pattern = nrv.a;
        CREATOR = new nlf();
    }

    public MediaInfo(String str, int i, String str2, nli nliVar, long j, List list, nmb nmbVar, String str3, List list2, List list3, String str4, nmc nmcVar, long j2, String str5, String str6, String str7, String str8) {
        this.p = str;
        this.a = i;
        this.b = str2;
        this.c = nliVar;
        this.d = j;
        this.e = list;
        this.f = nmbVar;
        this.g = str3;
        if (str3 != null) {
            try {
                this.o = new JSONObject(this.g);
            } catch (JSONException unused) {
                this.o = null;
                this.g = null;
            }
        } else {
            this.o = null;
        }
        this.q = list2;
        this.r = list3;
        this.h = str4;
        this.i = nmcVar;
        this.j = j2;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        if (this.p == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    public final String a() {
        String str = this.p;
        return str == null ? "" : str;
    }

    public final JSONObject b() throws JSONException {
        long j;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.p);
            jSONObject.putOpt("contentUrl", this.l);
            int i = this.a;
            jSONObject.put("streamType", i != 1 ? i != 2 ? "NONE" : "LIVE" : "BUFFERED");
            Object obj = this.b;
            if (obj != null) {
                jSONObject.put("contentType", obj);
            }
            nli nliVar = this.c;
            if (nliVar != null) {
                jSONObject.put("metadata", nliVar.b());
            }
            long j2 = this.d;
            long j3 = -1;
            if (j2 <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", nrv.a(j2));
            }
            if (this.e != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack mediaTrack : this.e) {
                    long j4 = j3;
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("trackId", mediaTrack.a);
                        int i2 = mediaTrack.b;
                        if (i2 == 1) {
                            jSONObject2.put("type", "TEXT");
                        } else if (i2 == 2) {
                            jSONObject2.put("type", "AUDIO");
                        } else if (i2 == 3) {
                            jSONObject2.put("type", "VIDEO");
                        }
                        String str = mediaTrack.c;
                        if (str != null) {
                            jSONObject2.put("trackContentId", str);
                        }
                        String str2 = mediaTrack.d;
                        if (str2 != null) {
                            jSONObject2.put("trackContentType", str2);
                        }
                        String str3 = mediaTrack.e;
                        if (str3 != null) {
                            jSONObject2.put("name", str3);
                        }
                        String str4 = mediaTrack.f;
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject2.put("language", str4);
                        }
                        int i3 = mediaTrack.g;
                        if (i3 == 1) {
                            jSONObject2.put("subtype", "SUBTITLES");
                        } else if (i3 == 2) {
                            jSONObject2.put("subtype", "CAPTIONS");
                        } else if (i3 == 3) {
                            jSONObject2.put("subtype", "DESCRIPTIONS");
                        } else if (i3 == 4) {
                            jSONObject2.put("subtype", "CHAPTERS");
                        } else if (i3 == 5) {
                            jSONObject2.put("subtype", "METADATA");
                        }
                        List list = mediaTrack.h;
                        if (list != null) {
                            jSONObject2.put("roles", new JSONArray((Collection) list));
                        }
                        JSONObject jSONObject3 = mediaTrack.j;
                        if (jSONObject3 != null) {
                            jSONObject2.put("customData", jSONObject3);
                        }
                    } catch (JSONException unused) {
                    }
                    jSONArray.put(jSONObject2);
                    j3 = j4;
                }
                j = j3;
                jSONObject.put("tracks", jSONArray);
            } else {
                j = -1;
            }
            nmb nmbVar = this.f;
            if (nmbVar != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("fontScale", nmbVar.a);
                    int i4 = nmbVar.b;
                    if (i4 != 0) {
                        jSONObject4.put("foregroundColor", nmb.b(i4));
                    }
                    int i5 = nmbVar.c;
                    if (i5 != 0) {
                        jSONObject4.put("backgroundColor", nmb.b(i5));
                    }
                    int i6 = nmbVar.d;
                    if (i6 == 0) {
                        jSONObject4.put("edgeType", "NONE");
                    } else if (i6 == 1) {
                        jSONObject4.put("edgeType", "OUTLINE");
                    } else if (i6 == 2) {
                        jSONObject4.put("edgeType", "DROP_SHADOW");
                    } else if (i6 == 3) {
                        jSONObject4.put("edgeType", "RAISED");
                    } else if (i6 == 4) {
                        jSONObject4.put("edgeType", "DEPRESSED");
                    }
                    int i7 = nmbVar.e;
                    if (i7 != 0) {
                        jSONObject4.put("edgeColor", nmb.b(i7));
                    }
                    int i8 = nmbVar.f;
                    if (i8 == 0) {
                        jSONObject4.put("windowType", "NONE");
                    } else if (i8 == 1) {
                        jSONObject4.put("windowType", "NORMAL");
                    } else if (i8 == 2) {
                        jSONObject4.put("windowType", "ROUNDED_CORNERS");
                    }
                    int i9 = nmbVar.g;
                    if (i9 != 0) {
                        jSONObject4.put("windowColor", nmb.b(i9));
                    }
                    if (nmbVar.f == 2) {
                        jSONObject4.put("windowRoundedCornerRadius", nmbVar.h);
                    }
                    String str5 = nmbVar.i;
                    if (str5 != null) {
                        jSONObject4.put("fontFamily", str5);
                    }
                    switch (nmbVar.j) {
                        case 0:
                            jSONObject4.put("fontGenericFamily", "SANS_SERIF");
                            break;
                        case 1:
                            jSONObject4.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                            break;
                        case 2:
                            jSONObject4.put("fontGenericFamily", "SERIF");
                            break;
                        case 3:
                            jSONObject4.put("fontGenericFamily", "MONOSPACED_SERIF");
                            break;
                        case 4:
                            jSONObject4.put("fontGenericFamily", "CASUAL");
                            break;
                        case 5:
                            jSONObject4.put("fontGenericFamily", "CURSIVE");
                            break;
                        case 6:
                            jSONObject4.put("fontGenericFamily", "SMALL_CAPITALS");
                            break;
                    }
                    int i10 = nmbVar.k;
                    if (i10 == 0) {
                        jSONObject4.put("fontStyle", "NORMAL");
                    } else if (i10 == 1) {
                        jSONObject4.put("fontStyle", "BOLD");
                    } else if (i10 == 2) {
                        jSONObject4.put("fontStyle", "ITALIC");
                    } else if (i10 == 3) {
                        jSONObject4.put("fontStyle", "BOLD_ITALIC");
                    }
                    JSONObject jSONObject5 = nmbVar.m;
                    if (jSONObject5 != null) {
                        jSONObject4.put("customData", jSONObject5);
                    }
                } catch (JSONException unused2) {
                }
                jSONObject.put("textTrackStyle", jSONObject4);
            }
            Object obj2 = this.o;
            if (obj2 != null) {
                jSONObject.put("customData", obj2);
            }
            Object obj3 = this.h;
            if (obj3 != null) {
                jSONObject.put("entity", obj3);
            }
            if (this.q != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (njx njxVar : this.q) {
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("id", njxVar.b);
                        jSONObject6.put("position", nrv.a(njxVar.a));
                        jSONObject6.put("isWatched", njxVar.d);
                        jSONObject6.put("isEmbedded", njxVar.f);
                        jSONObject6.put("duration", nrv.a(njxVar.c));
                        jSONObject6.put("expanded", njxVar.g);
                        String[] strArr = njxVar.e;
                        if (strArr != null) {
                            JSONArray jSONArray3 = new JSONArray();
                            for (String str6 : strArr) {
                                jSONArray3.put(str6);
                            }
                            jSONObject6.put("breakClipIds", jSONArray3);
                        }
                    } catch (JSONException unused3) {
                    }
                    jSONArray2.put(jSONObject6);
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.r != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (njw njwVar : this.r) {
                    JSONObject jSONObject7 = new JSONObject();
                    try {
                        jSONObject7.put("id", njwVar.a);
                        jSONObject7.put("duration", nrv.a(njwVar.c));
                        long j5 = njwVar.j;
                        if (j5 != j) {
                            jSONObject7.put("whenSkippable", nrv.a(j5));
                        }
                        String str7 = njwVar.h;
                        if (str7 != null) {
                            jSONObject7.put("contentId", str7);
                        }
                        String str8 = njwVar.e;
                        if (str8 != null) {
                            jSONObject7.put("contentType", str8);
                        }
                        String str9 = njwVar.b;
                        if (str9 != null) {
                            jSONObject7.put("title", str9);
                        }
                        String str10 = njwVar.d;
                        if (str10 != null) {
                            jSONObject7.put("contentUrl", str10);
                        }
                        String str11 = njwVar.f;
                        if (str11 != null) {
                            jSONObject7.put("clickThroughUrl", str11);
                        }
                        JSONObject jSONObject8 = njwVar.m;
                        if (jSONObject8 != null) {
                            jSONObject7.put("customData", jSONObject8);
                        }
                        String str12 = njwVar.i;
                        if (str12 != null) {
                            jSONObject7.put("posterUrl", str12);
                        }
                        String str13 = njwVar.k;
                        if (str13 != null) {
                            jSONObject7.put("hlsSegmentFormat", str13);
                        }
                        nmc nmcVar = njwVar.l;
                        if (nmcVar != null) {
                            jSONObject7.put("vastAdsRequest", nmcVar.b());
                        }
                    } catch (JSONException unused4) {
                    }
                    jSONArray4.put(jSONObject7);
                }
                jSONObject.put("breakClips", jSONArray4);
            }
            nmc nmcVar2 = this.i;
            if (nmcVar2 != null) {
                jSONObject.put("vmapAdsRequest", nmcVar2.b());
            }
            long j6 = this.j;
            if (j6 != j) {
                jSONObject.put("startAbsoluteTime", nrv.a(j6));
            }
            jSONObject.putOpt("atvEntity", this.k);
            Object obj4 = this.m;
            if (obj4 != null) {
                jSONObject.put("hlsSegmentFormat", obj4);
            }
            Object obj5 = this.n;
            if (obj5 != null) {
                jSONObject.put("hlsVideoSegmentFormat", obj5);
            }
        } catch (JSONException unused5) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[LOOP:0: B:5:0x0023->B:32:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a A[LOOP:1: B:40:0x00dc->B:67:0x018a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0191 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(org.json.JSONObject r41) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.c(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.o;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.o;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || oct.a(jSONObject, jSONObject2)) && nrv.i(this.p, mediaInfo.p) && this.a == mediaInfo.a && nrv.i(this.b, mediaInfo.b) && nrv.i(this.c, mediaInfo.c) && this.d == mediaInfo.d && nrv.i(this.e, mediaInfo.e) && nrv.i(this.f, mediaInfo.f) && nrv.i(this.q, mediaInfo.q) && nrv.i(this.r, mediaInfo.r) && nrv.i(this.h, mediaInfo.h) && nrv.i(this.i, mediaInfo.i) && this.j == mediaInfo.j && nrv.i(this.k, mediaInfo.k) && nrv.i(this.l, mediaInfo.l) && nrv.i(this.m, mediaInfo.m) && nrv.i(this.n, mediaInfo.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.p, Integer.valueOf(this.a), this.b, this.c, Long.valueOf(this.d), String.valueOf(this.o), this.e, this.f, this.q, this.r, this.h, this.i, Long.valueOf(this.j), this.k, this.m, this.n});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.o;
        this.g = jSONObject == null ? null : jSONObject.toString();
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, a());
        ocv.B(parcel, 3, this.a);
        ocv.O(parcel, 4, this.b);
        ocv.N(parcel, 5, this.c, i);
        ocv.C(parcel, 6, this.d);
        ocv.S(parcel, 7, this.e);
        ocv.N(parcel, 8, this.f, i);
        ocv.O(parcel, 9, this.g);
        List list = this.q;
        ocv.S(parcel, 10, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.r;
        ocv.S(parcel, 11, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        ocv.O(parcel, 12, this.h);
        ocv.N(parcel, 13, this.i, i);
        ocv.C(parcel, 14, this.j);
        ocv.O(parcel, 15, this.k);
        ocv.O(parcel, 16, this.l);
        ocv.O(parcel, 17, this.m);
        ocv.O(parcel, 18, this.n);
        ocv.x(parcel, iV);
    }

    public MediaInfo(JSONObject jSONObject) throws JSONException {
        double d;
        int i;
        int i2;
        ImmutableList immutableListBuild;
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        String strOptString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(strOptString)) {
            this.a = 0;
        } else if ("BUFFERED".equals(strOptString)) {
            this.a = 1;
        } else if ("LIVE".equals(strOptString)) {
            this.a = 2;
        } else {
            this.a = -1;
        }
        this.b = nrv.e(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            nli nliVar = new nli(jSONObject2.getInt("metadataType"));
            this.c = nliVar;
            nliVar.c(jSONObject2);
        }
        this.d = -1L;
        double d2 = 0.0d;
        if (this.a != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double dOptDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(dOptDouble) && !Double.isInfinite(dOptDouble) && dOptDouble >= 0.0d) {
                this.d = nrv.b(dOptDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i3 = 0;
            while (i3 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                double d3 = d2;
                long j = jSONObject3.getLong("trackId");
                String strOptString2 = jSONObject3.optString("type");
                if ("TEXT".equals(strOptString2)) {
                    i = 1;
                } else if ("AUDIO".equals(strOptString2)) {
                    i = 2;
                } else {
                    i = "VIDEO".equals(strOptString2) ? 3 : 0;
                }
                String strE = nrv.e(jSONObject3, "trackContentId");
                String strE2 = nrv.e(jSONObject3, "trackContentType");
                String strE3 = nrv.e(jSONObject3, "name");
                String strE4 = nrv.e(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i2 = 1;
                    } else if ("CAPTIONS".equals(string)) {
                        i2 = 2;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i2 = 3;
                    } else if ("CHAPTERS".equals(string)) {
                        i2 = 4;
                    } else {
                        i2 = "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i2 = 0;
                }
                if (jSONObject3.has("roles")) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                        builder.add((ImmutableList.Builder) jSONArray2.optString(i4));
                    }
                    immutableListBuild = builder.build();
                } else {
                    immutableListBuild = null;
                }
                arrayList.add(new MediaTrack(j, i, strE, strE2, strE3, strE4, i2, immutableListBuild, jSONObject3.optJSONObject("customData")));
                i3++;
                d2 = d3;
            }
            d = d2;
            this.e = new ArrayList(arrayList);
        } else {
            d = 0.0d;
            this.e = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            nmb nmbVar = new nmb(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            nmbVar.a = (float) jSONObject4.optDouble("fontScale", 1.0d);
            nmbVar.b = nmb.a(jSONObject4.optString("foregroundColor"));
            nmbVar.c = nmb.a(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    nmbVar.d = 0;
                } else if ("OUTLINE".equals(string2)) {
                    nmbVar.d = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    nmbVar.d = 2;
                } else if ("RAISED".equals(string2)) {
                    nmbVar.d = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    nmbVar.d = 4;
                }
            }
            nmbVar.e = nmb.a(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    nmbVar.f = 0;
                } else if ("NORMAL".equals(string3)) {
                    nmbVar.f = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    nmbVar.f = 2;
                }
            }
            nmbVar.g = nmb.a(jSONObject4.optString("windowColor"));
            if (nmbVar.f == 2) {
                nmbVar.h = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            nmbVar.i = nrv.e(jSONObject4, "fontFamily");
            if (jSONObject4.has("fontGenericFamily")) {
                String string4 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string4)) {
                    nmbVar.j = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                    nmbVar.j = 1;
                } else if ("SERIF".equals(string4)) {
                    nmbVar.j = 2;
                } else if ("MONOSPACED_SERIF".equals(string4)) {
                    nmbVar.j = 3;
                } else if ("CASUAL".equals(string4)) {
                    nmbVar.j = 4;
                } else if ("CURSIVE".equals(string4)) {
                    nmbVar.j = 5;
                } else if ("SMALL_CAPITALS".equals(string4)) {
                    nmbVar.j = 6;
                }
            }
            if (jSONObject4.has("fontStyle")) {
                String string5 = jSONObject4.getString("fontStyle");
                if ("NORMAL".equals(string5)) {
                    nmbVar.k = 0;
                } else if ("BOLD".equals(string5)) {
                    nmbVar.k = 1;
                } else if ("ITALIC".equals(string5)) {
                    nmbVar.k = 2;
                } else if ("BOLD_ITALIC".equals(string5)) {
                    nmbVar.k = 3;
                }
            }
            nmbVar.m = jSONObject4.optJSONObject("customData");
            this.f = nmbVar;
        } else {
            this.f = null;
        }
        c(jSONObject);
        this.o = jSONObject.optJSONObject("customData");
        this.h = nrv.e(jSONObject, "entity");
        this.k = nrv.e(jSONObject, "atvEntity");
        this.i = nmc.a(jSONObject.optJSONObject("vmapAdsRequest"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double dOptDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(dOptDouble2) && !Double.isInfinite(dOptDouble2) && dOptDouble2 >= d) {
                this.j = nrv.b(dOptDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.l = jSONObject.optString("contentUrl");
        }
        this.m = nrv.e(jSONObject, "hlsSegmentFormat");
        this.n = nrv.e(jSONObject, "hlsVideoSegmentFormat");
    }
}
