package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.katniss.R;
import defpackage.a;
import defpackage.ahj;
import defpackage.atk;
import defpackage.bbh;
import defpackage.bbj;
import defpackage.bbl;
import defpackage.bbm;
import defpackage.bbn;
import defpackage.bbo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DatePicker extends bbl {
    public static final int[] a = {5, 2, 1};
    public int b;
    public int c;
    public int d;
    public Calendar e;
    public Calendar f;
    public Calendar g;
    public Calendar h;
    private String o;
    private bbm p;
    private bbm q;
    private bbm r;
    private final DateFormat s;
    private bbn t;

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.datePickerStyle);
    }

    public static boolean c(bbm bbmVar, int i) {
        if (i == bbmVar.c) {
            return false;
        }
        bbmVar.c = i;
        return true;
    }

    public static boolean d(bbm bbmVar, int i) {
        if (i == bbmVar.b) {
            return false;
        }
        bbmVar.b = i;
        return true;
    }

    private final boolean l(String str, Calendar calendar) {
        try {
            calendar.setTime(this.s.parse(str));
            return true;
        } catch (ParseException unused) {
            Log.w("DatePicker", a.e(str, "Date: ", " not in format: MM/dd/yyyy"));
            return false;
        }
    }

    @Override // defpackage.bbl
    public final void a(int i, int i2) {
        this.h.setTimeInMillis(this.g.getTimeInMillis());
        int i3 = g(i).a;
        if (i == this.c) {
            this.h.add(5, i2 - i3);
        } else if (i == this.b) {
            this.h.add(2, i2 - i3);
        } else {
            if (i != this.d) {
                throw new IllegalArgumentException();
            }
            this.h.add(1, i2 - i3);
        }
        e(this.h.get(1), this.h.get(2), this.h.get(5));
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = new String(android.text.format.DateFormat.getDateFormatOrder(getContext()));
        }
        if (TextUtils.equals(this.o, str)) {
            return;
        }
        this.o = str;
        String bestDateTimePattern = android.text.format.DateFormat.getBestDateTimePattern(this.t.a, str);
        if (true == TextUtils.isEmpty(bestDateTimePattern)) {
            bestDateTimePattern = "MM/dd/yyyy";
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        boolean z = false;
        char c = 0;
        for (int i = 0; i < bestDateTimePattern.length(); i++) {
            char cCharAt = bestDateTimePattern.charAt(i);
            if (cCharAt != ' ') {
                if (cCharAt != '\'') {
                    if (!z) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= 6) {
                                sb.append(cCharAt);
                                break;
                            } else if (cCharAt != cArr[i2]) {
                                i2++;
                            } else if (cCharAt != c) {
                                arrayList.add(sb.toString());
                                sb.setLength(0);
                            }
                        }
                    } else {
                        sb.append(cCharAt);
                    }
                    c = cCharAt;
                } else if (z) {
                    z = false;
                } else {
                    sb.setLength(0);
                    z = true;
                }
            }
        }
        arrayList.add(sb.toString());
        if (arrayList.size() != str.length() + 1) {
            throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of datePickerFormat: " + str.length() + " + 1");
        }
        this.m.clear();
        this.m.addAll(arrayList);
        this.q = null;
        this.p = null;
        this.r = null;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        String upperCase = str.toUpperCase(this.t.a);
        ArrayList arrayList2 = new ArrayList(3);
        for (int i3 = 0; i3 < upperCase.length(); i3++) {
            char cCharAt2 = upperCase.charAt(i3);
            if (cCharAt2 == 'D') {
                if (this.q != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                bbm bbmVar = new bbm();
                this.q = bbmVar;
                arrayList2.add(bbmVar);
                this.q.e = "%02d";
                this.c = i3;
            } else if (cCharAt2 != 'M') {
                if (cCharAt2 != 'Y') {
                    throw new IllegalArgumentException("datePicker format error");
                }
                if (this.r != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                bbm bbmVar2 = new bbm();
                this.r = bbmVar2;
                arrayList2.add(bbmVar2);
                this.d = i3;
                this.r.e = "%d";
            } else {
                if (this.p != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                bbm bbmVar3 = new bbm();
                this.p = bbmVar3;
                arrayList2.add(bbmVar3);
                this.p.d = this.t.b;
                this.b = i3;
            }
        }
        if (this.m.size() == 0) {
            throw new IllegalStateException("Separators size is: " + this.m.size() + ". At least one separator must be provided");
        }
        if (this.m.size() == 1) {
            CharSequence charSequence = (CharSequence) this.m.get(0);
            this.m.clear();
            this.m.add("");
            for (int i4 = 0; i4 < arrayList2.size() - 1; i4++) {
                this.m.add(charSequence);
            }
            this.m.add("");
        } else if (this.m.size() != arrayList2.size() + 1) {
            throw new IllegalStateException("Separators size: " + this.m.size() + " mustequal the size of columns: " + arrayList2.size() + " + 1");
        }
        List list = this.j;
        list.clear();
        this.i.removeAllViews();
        this.k = new ArrayList(arrayList2);
        if (this.l > this.k.size() - 1) {
            this.l = this.k.size() - 1;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int columnsCount = getColumnsCount();
        if (!TextUtils.isEmpty((CharSequence) this.m.get(0))) {
            TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.lb_picker_separator, this.i, false);
            textView.setText((CharSequence) this.m.get(0));
            this.i.addView(textView);
        }
        int i5 = 0;
        while (i5 < columnsCount) {
            VerticalGridView verticalGridView = (VerticalGridView) layoutInflaterFrom.inflate(R.layout.lb_picker_column, this.i, false);
            super.j(verticalGridView);
            verticalGridView.setWindowAlignment(0);
            verticalGridView.t = false;
            verticalGridView.setFocusable(isActivated());
            verticalGridView.setItemViewCacheSize(0);
            list.add(verticalGridView);
            this.i.addView(verticalGridView);
            int i6 = i5 + 1;
            if (!TextUtils.isEmpty((CharSequence) this.m.get(i6))) {
                TextView textView2 = (TextView) layoutInflaterFrom.inflate(R.layout.lb_picker_separator, this.i, false);
                textView2.setText((CharSequence) this.m.get(i6));
                this.i.addView(textView2);
            }
            verticalGridView.ag(new bbj(this, getPickerItemLayoutId(), getPickerItemTextViewId(), i5));
            verticalGridView.ad.ai(this.n);
            i5 = i6;
        }
        f();
    }

    public final void e(int i, int i2, int i3) {
        if (this.g.get(1) == i && this.g.get(2) == i3 && this.g.get(5) == i2) {
            return;
        }
        this.g.set(i, i2, i3);
        if (this.g.before(this.e)) {
            this.g.setTimeInMillis(this.e.getTimeInMillis());
        } else if (this.g.after(this.f)) {
            this.g.setTimeInMillis(this.f.getTimeInMillis());
        }
        f();
    }

    public final void f() {
        post(new bbh(this));
    }

    public long getDate() {
        return this.g.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.o;
    }

    public long getMaxDate() {
        return this.f.getTimeInMillis();
    }

    public long getMinDate() {
        return this.e.getTimeInMillis();
    }

    public DatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        Locale locale = Locale.getDefault();
        getContext().getResources();
        bbn bbnVar = new bbn(locale);
        this.t = bbnVar;
        this.h = bbo.a(this.h, bbnVar.a);
        this.e = bbo.a(this.e, this.t.a);
        this.f = bbo.a(this.f, this.t.a);
        this.g = bbo.a(this.g, this.t.a);
        bbm bbmVar = this.p;
        if (bbmVar != null) {
            bbmVar.d = this.t.b;
            h(this.b, bbmVar);
        }
        int[] iArr = atk.f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ahj.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(0);
            String string2 = typedArrayObtainStyledAttributes.getString(1);
            String string3 = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            this.h.clear();
            if (TextUtils.isEmpty(string) || !l(string, this.h)) {
                this.h.set(1900, 0, 1);
            }
            this.e.setTimeInMillis(this.h.getTimeInMillis());
            this.h.clear();
            if (TextUtils.isEmpty(string2) || !l(string2, this.h)) {
                this.h.set(2100, 0, 1);
            }
            this.f.setTimeInMillis(this.h.getTimeInMillis());
            b(TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(context)) : string3);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
