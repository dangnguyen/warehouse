require 'prawn_monkeypatch'
prawn_document() do |pdf|
  pdf.text "DELIVERY NOTE", :size => 16, :style => :bold
  pdf.text "Customer: ............................................................."
  table_data = [[Prawn::Table::Cell::Text.new( pdf, [0,0], :content => "<b>Item code</b>", :inline_format => true), Prawn::Table::Cell::Text.new( pdf, [0,0], :content => "<b>Description</b>", :inline_format => true), Prawn::Table::Cell::Text.new( pdf, [0,0], :content => "<b>Quantity</b>", :inline_format => true), Prawn::Table::Cell::Text.new( pdf, [0,0], :content => "<b>Time</b>", :inline_format => true), Prawn::Table::Cell::Text.new( pdf, [0,0], :content => "<b>Cost</b>", :inline_format => true)],
                   [@item.itemCode, @item.description, @item.qty, Time.at(@item.date/1000).strftime('%Y/%m/%d %H:%M:%S') , @item.cost]]

    pdf.table(table_data,:width => 500)
end