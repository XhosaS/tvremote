package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.leanback.widget.GridLayoutManager;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tv.remote.service.R;
import defpackage.ael;
import defpackage.awy;
import defpackage.b;
import defpackage.ig;
import defpackage.in;
import defpackage.iq;
import defpackage.ir;
import defpackage.ja;
import defpackage.ki;
import defpackage.qv;
import defpackage.tk;
import defpackage.ux;
import defpackage.wa;
import defpackage.wq;
import defpackage.wr;
import defpackage.wz;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DatePicker extends wq {
    public static final int[] a = {5, 2, 1};
    public int b;
    public int c;
    public int d;
    public Calendar e;
    public Calendar f;
    public Calendar g;
    private String p;
    private wr q;
    private wr r;
    private wr s;
    private final DateFormat t;
    private Calendar u;
    private awy v;

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.datePickerStyle);
    }

    public static boolean b(wr wrVar, int i) {
        if (i == wrVar.c) {
            return false;
        }
        wrVar.c = i;
        return true;
    }

    public static boolean c(wr wrVar, int i) {
        if (i == wrVar.b) {
            return false;
        }
        wrVar.b = i;
        return true;
    }

    private final boolean j(String str, Calendar calendar) {
        try {
            calendar.setTime(this.t.parse(str));
            return true;
        } catch (ParseException unused) {
            Log.w("DatePicker", b.c(str, "Date: ", " not in format: MM/dd/yyyy"));
            return false;
        }
    }

    private final void k() {
        post(new ki(this, 11, null));
    }

    @Override // defpackage.wq
    public final void a(int i, int i2) {
        this.u.setTimeInMillis(this.g.getTimeInMillis());
        int i3 = e(i).a;
        if (i == this.c) {
            this.u.add(5, i2 - i3);
        } else if (i == this.b) {
            this.u.add(2, i2 - i3);
        } else {
            if (i != this.d) {
                throw new IllegalArgumentException();
            }
            this.u.add(1, i2 - i3);
        }
        int i4 = this.u.get(1);
        int i5 = this.u.get(2);
        int i6 = this.u.get(5);
        if (this.g.get(1) == i4 && this.g.get(2) == i6 && this.g.get(5) == i5) {
            return;
        }
        this.g.set(i4, i5, i6);
        if (this.g.before(this.e)) {
            this.g.setTimeInMillis(this.e.getTimeInMillis());
        } else if (this.g.after(this.f)) {
            this.g.setTimeInMillis(this.f.getTimeInMillis());
        }
        k();
    }

    public DatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        Locale locale = Locale.getDefault();
        getContext().getResources();
        awy awyVar = new awy(locale);
        this.v = awyVar;
        this.u = wz.b(this.u, (Locale) awyVar.b);
        this.e = wz.b(this.e, (Locale) this.v.b);
        this.f = wz.b(this.f, (Locale) this.v.b);
        this.g = wz.b(this.g, (Locale) this.v.b);
        wr wrVar = this.q;
        if (wrVar != null) {
            wrVar.d = (CharSequence[]) this.v.a;
            f(this.b, wrVar);
        }
        int[] iArr = ux.c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        qv.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(0);
            String string2 = typedArrayObtainStyledAttributes.getString(1);
            String string3 = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            this.u.clear();
            if (TextUtils.isEmpty(string) || !j(string, this.u)) {
                this.u.set(1900, 0, 1);
            }
            this.e.setTimeInMillis(this.u.getTimeInMillis());
            this.u.clear();
            if (TextUtils.isEmpty(string2) || !j(string2, this.u)) {
                this.u.set(2100, 0, 1);
            }
            this.f.setTimeInMillis(this.u.getTimeInMillis());
            string3 = TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(context)) : string3;
            string3 = TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(getContext())) : string3;
            if (TextUtils.equals(this.p, string3)) {
                return;
            }
            this.p = string3;
            String bestDateTimePattern = android.text.format.DateFormat.getBestDateTimePattern((Locale) this.v.b, string3);
            String str = true != TextUtils.isEmpty(bestDateTimePattern) ? bestDateTimePattern : "MM/dd/yyyy";
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
            boolean z = false;
            char c = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != ' ') {
                    if (cCharAt != '\'') {
                        if (!z) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 6) {
                                    sb.append(cCharAt);
                                    break;
                                } else if (cCharAt != cArr[i3]) {
                                    i3++;
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
            if (arrayList.size() != string3.length() + 1) {
                throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of datePickerFormat: " + string3.length() + " + 1");
            }
            this.l.clear();
            this.l.addAll(arrayList);
            this.r = null;
            this.q = null;
            this.s = null;
            int i4 = -1;
            this.b = -1;
            this.c = -1;
            this.d = -1;
            String upperCase = string3.toUpperCase((Locale) this.v.b);
            ArrayList arrayList2 = new ArrayList(3);
            for (int i5 = 0; i5 < upperCase.length(); i5++) {
                char cCharAt2 = upperCase.charAt(i5);
                if (cCharAt2 == 'D') {
                    if (this.r != null) {
                        throw new IllegalArgumentException("datePicker format error");
                    }
                    wr wrVar2 = new wr();
                    this.r = wrVar2;
                    arrayList2.add(wrVar2);
                    this.r.e = "%02d";
                    this.c = i5;
                } else if (cCharAt2 != 'M') {
                    if (cCharAt2 != 'Y') {
                        throw new IllegalArgumentException("datePicker format error");
                    }
                    if (this.s != null) {
                        throw new IllegalArgumentException("datePicker format error");
                    }
                    wr wrVar3 = new wr();
                    this.s = wrVar3;
                    arrayList2.add(wrVar3);
                    this.d = i5;
                    this.s.e = "%d";
                } else {
                    if (this.q != null) {
                        throw new IllegalArgumentException("datePicker format error");
                    }
                    wr wrVar4 = new wr();
                    this.q = wrVar4;
                    arrayList2.add(wrVar4);
                    this.q.d = (CharSequence[]) this.v.a;
                    this.b = i5;
                }
            }
            if (this.l.size() == 0) {
                throw new IllegalStateException("Separators size is: " + this.l.size() + ". At least one separator must be provided");
            }
            if (this.l.size() == 1) {
                CharSequence charSequence = (CharSequence) this.l.get(0);
                this.l.clear();
                this.l.add("");
                for (int i6 = 0; i6 < arrayList2.size() - 1; i6++) {
                    this.l.add(charSequence);
                }
                this.l.add("");
            } else if (this.l.size() != arrayList2.size() + 1) {
                throw new IllegalStateException("Separators size: " + this.l.size() + " mustequal the size of columns: " + arrayList2.size() + " + 1");
            }
            this.i.clear();
            this.h.removeAllViews();
            this.j = new ArrayList(arrayList2);
            if (this.k > this.j.size() - 1) {
                this.k = this.j.size() - 1;
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            int iD = d();
            boolean zIsEmpty = TextUtils.isEmpty((CharSequence) this.l.get(0));
            int i7 = R.layout.lb_picker_separator;
            if (!zIsEmpty) {
                TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.lb_picker_separator, this.h, false);
                textView.setText((CharSequence) this.l.get(0));
                this.h.addView(textView);
            }
            int i8 = 0;
            while (i8 < iD) {
                VerticalGridView verticalGridView = (VerticalGridView) layoutInflaterFrom.inflate(R.layout.lb_picker_column, this.h, false);
                super.h(verticalGridView);
                verticalGridView.ab.O.d.e = 0;
                verticalGridView.requestLayout();
                verticalGridView.s = false;
                verticalGridView.setFocusable(isActivated());
                ir irVar = verticalGridView.f;
                irVar.e = 0;
                irVar.m();
                this.i.add(verticalGridView);
                this.h.addView(verticalGridView);
                int i9 = i8 + 1;
                if (!TextUtils.isEmpty((CharSequence) this.l.get(i9))) {
                    TextView textView2 = (TextView) layoutInflaterFrom.inflate(i7, this.h, false);
                    textView2.setText((CharSequence) this.l.get(i9));
                    this.h.addView(textView2);
                }
                ig igVar = new ig(this, this.m, this.n, i8);
                verticalGridView.suppressLayout(false);
                ig igVar2 = verticalGridView.l;
                if (igVar2 != null) {
                    igVar2.a.unregisterObserver(verticalGridView.e);
                    ig igVar3 = verticalGridView.l;
                }
                verticalGridView.N();
                verticalGridView.U.p();
                ig igVar4 = verticalGridView.l;
                verticalGridView.l = igVar;
                igVar.a.registerObserver(verticalGridView.e);
                in inVar = verticalGridView.m;
                if (inVar != null) {
                    ig igVar5 = verticalGridView.l;
                    inVar.bs(igVar4);
                }
                ir irVar2 = verticalGridView.f;
                ig igVar6 = verticalGridView.l;
                irVar2.d();
                irVar2.f(igVar4, true);
                ael aelVarO = irVar2.o();
                if (igVar4 != null) {
                    aelVarO.a += i4;
                }
                if (aelVarO.a == 0) {
                    for (int i10 = 0; i10 < ((SparseArray) aelVarO.b).size(); i10++) {
                        iq iqVar = (iq) ((SparseArray) aelVarO.b).valueAt(i10);
                        ArrayList arrayList3 = iqVar.a;
                        int size = arrayList3.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            tk.d(((ja) arrayList3.get(i11)).b);
                        }
                        iqVar.a.clear();
                    }
                }
                if (igVar6 != null) {
                    aelVarO.a++;
                }
                irVar2.e();
                verticalGridView.K.f = true;
                verticalGridView.M(false);
                verticalGridView.requestLayout();
                wa waVar = this.o;
                GridLayoutManager gridLayoutManager = verticalGridView.ab;
                if (waVar == null) {
                    gridLayoutManager.n = null;
                } else {
                    ArrayList arrayList4 = gridLayoutManager.n;
                    if (arrayList4 == null) {
                        gridLayoutManager.n = new ArrayList();
                    } else {
                        arrayList4.clear();
                    }
                    gridLayoutManager.n.add(waVar);
                }
                i8 = i9;
                i4 = -1;
                i7 = R.layout.lb_picker_separator;
            }
            k();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
